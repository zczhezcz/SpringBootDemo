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
 * agv
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FlowAgv implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 河图agv编号
     */
    private String hetuAgvId;

    /**
     * 是否在线 0:是;1:否;
     */
    private Integer online;

    /**
     * agv状态 0:空闲;1:非空闲;2:充电中
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

    /**
     * @Param 电量
     **/
    private Integer power;
}
