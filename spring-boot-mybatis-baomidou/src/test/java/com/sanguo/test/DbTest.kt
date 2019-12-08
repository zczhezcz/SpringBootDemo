package com.sanguo.test

import com.sanguo.mybatis.baomidou.Application
import com.sanguo.mybatis.baomidou.mapper.FlowTaskMapper
import com.sanguo.mybatis.baomidou.service.IFlowTaskJobService
import com.sanguo.mybatis.baomidou.service.IFlowTaskService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(classes = [Application::class])
class DbTest{

    @Autowired
    lateinit var flowTaskJobService: IFlowTaskJobService

    @Autowired
    lateinit var flowTaskService: IFlowTaskService
    @Test
    fun testFlowTaskJob(){
        System.out.println("-----beer-----"+flowTaskJobService.getById(6)?.errorMsg)
    }

    @Test
    fun testFlowTask(){
        System.out.println("-----beer2-----"+flowTaskService.findByStatusLength(300).get(0).agvId)
    }
}