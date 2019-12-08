package com.sanguo.mybatis.baomidou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sanguo.mybatis.baomidou.domain.FlowAgv;

/**
 * <p>
 * agv 服务类
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
public interface IFlowAgvService extends IService<FlowAgv> {
    FlowAgv findIdleAndPowerMinAgv();
    FlowAgv findIdleAndPowerMaxAgv();
}
