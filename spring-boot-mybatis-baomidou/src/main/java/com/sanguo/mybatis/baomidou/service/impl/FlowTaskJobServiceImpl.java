package com.sanguo.mybatis.baomidou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sanguo.mybatis.baomidou.domain.FlowAgv;
import com.sanguo.mybatis.baomidou.domain.FlowTaskJob;
import com.sanguo.mybatis.baomidou.enums.FlowAgvStatusEnum;
import com.sanguo.mybatis.baomidou.enums.FlowTaskJobStatusEnum;
import com.sanguo.mybatis.baomidou.mapper.FlowTaskJobMapper;
import com.sanguo.mybatis.baomidou.service.IFlowTaskJobService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 任务流执行job记录 服务实现类
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
@Service
public class FlowTaskJobServiceImpl extends ServiceImpl<FlowTaskJobMapper, FlowTaskJob> implements IFlowTaskJobService {

    @Override
    public void succJob(String jobId) {
        LambdaUpdateWrapper<FlowTaskJob> updateWrapper = Wrappers.lambdaUpdate();
        updateWrapper.set(FlowTaskJob::getStatus, FlowTaskJobStatusEnum.DONE.code)
                .eq(FlowTaskJob::getJobId, jobId);
        update(updateWrapper);

    }

    @Override
    public void failJob(String jobId, String errorMsg) {
        LambdaUpdateWrapper<FlowTaskJob> updateWrapper = Wrappers.lambdaUpdate();
        updateWrapper.set(FlowTaskJob::getStatus, FlowTaskJobStatusEnum.FAIL.code)
                .set(FlowTaskJob::getErrorMsg,errorMsg)
                .eq(FlowTaskJob::getJobId, jobId);
        update(updateWrapper);
    }


    @Override
    public List<FlowTaskJob> findByToZoneCode(String toZoneCode) {
        return list(new LambdaQueryWrapper<FlowTaskJob>()
                .eq(FlowTaskJob::getStatus, FlowAgvStatusEnum.FREE.code)
                .eq(FlowTaskJob::getToZoneCode,toZoneCode));
    }
}
