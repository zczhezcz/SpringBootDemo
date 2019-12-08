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
 * 开启任务流
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FlowTask implements Serializable {

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
     * 任务编号
     */
    private String taskCode;

    /**
     * 任务名称(展示)
     */
    private String taskName;

    /**
     * 锁定zone的flow_agv的id
     */
    private Long agvId;

    /**
     * 锁定zone的河图agv-id
     */
    private String hetuAgvId;

    /**
     * 任务执行状态 0:初始化;1:执行中;2:执行完成;
     */
    private Integer status;

    /**
     * 记录插入时间
     */
    private LocalDateTime createTime;

    /**
     * 记录更新时间
     */
    private LocalDateTime updateTime;


}
