package com.sanguo.mybatis.baomidou.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sanguo.mybatis.baomidou.domain.FlowTask;
import com.sanguo.mybatis.baomidou.enums.FlowTaskStatusEnum;
import com.sanguo.mybatis.baomidou.mapper.FlowTaskMapper;
import com.sanguo.mybatis.baomidou.service.IFlowTaskService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 开启任务流 服务实现类
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
@Service
public class FlowTaskServiceImpl extends ServiceImpl<FlowTaskMapper, FlowTask> implements IFlowTaskService {
    @Autowired
    private FlowTaskMapper flowTaskMapper;

    @Override
    public void doneTask(Long flowTaskId) {
        LambdaUpdateWrapper<FlowTask> updateWrapper = Wrappers.lambdaUpdate();
        updateWrapper.set(FlowTask::getStatus, FlowTaskStatusEnum.DONE.code)
                .eq(FlowTask::getId, flowTaskId);
        update(updateWrapper);
    }

    @Override
    public void doingTask(Long flowTaskId) {
        LambdaUpdateWrapper<FlowTask> updateWrapper = Wrappers.lambdaUpdate();
        updateWrapper.set(FlowTask::getStatus, FlowTaskStatusEnum.DOING.code)
                .eq(FlowTask::getId, flowTaskId);
        update(updateWrapper);
    }

    @Override
    public List<FlowTask> findByStatusLength(int length) {
        return flowTaskMapper.getByStatusLength(length);
    }

}
