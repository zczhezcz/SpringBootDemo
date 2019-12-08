package com.sanguo.mybatis.baomidou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sanguo.mybatis.baomidou.domain.FlowAgv;
import com.sanguo.mybatis.baomidou.enums.FlowAgvStatusEnum;
import com.sanguo.mybatis.baomidou.mapper.FlowAgvMapper;
import com.sanguo.mybatis.baomidou.service.IFlowAgvService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * agv 服务实现类
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
@Service
public class FlowAgvServiceImpl extends ServiceImpl<FlowAgvMapper, FlowAgv> implements IFlowAgvService {

    @Override
    public FlowAgv findIdleAndPowerMinAgv() {
        return list(new LambdaQueryWrapper<FlowAgv>()
                .eq(FlowAgv::getStatus, FlowAgvStatusEnum.FREE.code)
                .orderByAsc(FlowAgv::getPower))
                .get(0);
    }

    @Override
    public FlowAgv findIdleAndPowerMaxAgv() {
        return list(new LambdaQueryWrapper<FlowAgv>()
                .eq(FlowAgv::getStatus, FlowAgvStatusEnum.FREE.code)
                .orderByDesc(FlowAgv::getPower))
                .get(0);
    }
}
