package com.dachui.zxzdachuipro.cd;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dachui.zxzdachuipro.entity.ContractReport;
import com.dachui.zxzdachuipro.mapper.ContractReportMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.List;

/**
 * @Author: zxz
 * @Date: 2024-07-17-18:33
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    private ContractReportMapper contractReportMapper;

    @Test
    public void test(){
        LocalDate localDate = LocalDate.of(2024, 7, 18);
        List<ContractReport> list = contractReportMapper.selectList(new LambdaQueryWrapper<ContractReport>()
                .eq(ContractReport::getReportDate, localDate));
        System.out.println(JSON.toJSONString(list));
    }
}
