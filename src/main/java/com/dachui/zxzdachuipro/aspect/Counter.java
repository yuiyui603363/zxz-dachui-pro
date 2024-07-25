package com.dachui.zxzdachuipro.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zxz
 * @Date: 2024-06-25-15:22
 * @Description:
 */
@Aspect
public class Counter {
    private Map<Integer, Integer> countMap = new HashMap<>();

    @Pointcut("execution(* com.dachui.zxzdachuipro.cd.CD.playWithNumber(int)) && args(number)")
    public void playWithNumber(int number){}

    @Before(value = "playWithNumber(number)", argNames = "number")
    public void count(int number){
        int count = this.getCount(number);
        countMap.put(number, count+1);
    }

    public int getCount(int number){
        return countMap.getOrDefault(number, 0);
    }
}
