package com.sanguo.mybatis.baomidou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sanguo.mybatis.baomidou.domain.FlowTask;

import java.util.List;

/**
 * <p>
 * 开启任务流 服务类
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
public interface IFlowTaskService extends IService<FlowTask> {
    /**
     * 任务完成
     * @param flowTaskId
     */
    void doneTask(Long flowTaskId);

    /**
     * 任务执行中
     * @param flowTaskId
     */
    void doingTask(Long flowTaskId);

    /**
     * @Description
     * @Param
     * @return
     **/
    List<FlowTask> findByStatusLength(int length);
}
