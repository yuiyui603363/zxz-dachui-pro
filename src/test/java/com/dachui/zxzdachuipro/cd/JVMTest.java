package com.dachui.zxzdachuipro.cd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zxz
 * @Date: 2024-07-24-14:08
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class JVMTest {

    private static int stackLength = 0;

    public void pusStack(){
        stackLength ++;
        pusStack();
    }

    @Test
    public void test(){
        JVMTest jvmTest = new JVMTest();
        try {
            jvmTest.pusStack();
        }catch (Throwable e){
            System.out.println("stackLength:" + jvmTest.stackLength);
            throw e;
        }

    }
}
