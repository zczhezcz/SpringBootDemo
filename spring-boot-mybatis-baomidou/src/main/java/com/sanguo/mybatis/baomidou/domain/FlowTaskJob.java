package com.sanguo.mybatis.baomidou.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 任务流执行job记录
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FlowTaskJob implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 来源任务标识
     */
    private String sourceTask;

    /**
     * 任务id
     */
    private Long taskId;

    /**
     * 任务编号
     */
    private String taskCode;

    /**
     * 河图agv-id
     */
    private String hetuAgvId;

    /**
     * 锁定zone的flow_agv的id
     */
    private Long agvId;

    /**
     * 河图job-id
     */
    private String jobId;

    /**
     * job code
     */
    private String jobCode;

    /**
     * job 到达河图zone id
     */
    private String toHetuZoneId;

    /**
     * 对应flow_zone中的id
     */
    private Long toZoneId;

    /**
     * job 到达zone code
     */
    private String toZoneCode;

    /**
     * 任务执行状态 1:执行中;2:执行完成;3:执行失败
     */
    private Integer status;

    /**
     * 执行失败信息
     */
    private String errorMsg;

    /**
     * 记录插入时间
     */
    private LocalDateTime createTime;

    /**
     * 记录更新时间
     */
    private LocalDateTime updateTime;


}
