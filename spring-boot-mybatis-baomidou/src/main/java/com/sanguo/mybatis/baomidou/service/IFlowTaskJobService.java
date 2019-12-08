package com.sanguo.mybatis.baomidou.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.sanguo.mybatis.baomidou.domain.FlowTaskJob;
import com.sanguo.mybatis.baomidou.mapper.FlowTaskJobMapper;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * <p>
 * 任务流执行job记录 服务类
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
public interface IFlowTaskJobService extends IService<FlowTaskJob> {

    /**
     * job执行成功
     *
     * @param jobId 河图 job id
     */
    void succJob(String jobId);

    /**
     * job 执行失败
     *
     * @param jobId 河图 job id
     */
    void failJob(String jobId, String errorMsg);

    List<FlowTaskJob> findByToZoneCode(String id);
}

