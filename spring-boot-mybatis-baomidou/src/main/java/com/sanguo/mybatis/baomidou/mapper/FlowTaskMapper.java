package com.sanguo.mybatis.baomidou.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sanguo.mybatis.baomidou.domain.FlowTask;
import com.sun.tools.corba.se.idl.InterfaceGen;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 开启任务流 Mapper 接口
 * </p>
 *
 * @author anning
 * @since 2019-06-21
 */
public interface FlowTaskMapper extends BaseMapper<FlowTask> {

    @Select("SELECT * FROM flow_task t where UNIX_TIMESTAMP(t.update_time) - UNIX_TIMESTAMP(t.create_time) > #{length}")
    List<FlowTask> getByStatusLength(@Param("length") Integer length);
}
