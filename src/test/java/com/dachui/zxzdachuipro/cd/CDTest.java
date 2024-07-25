package com.dachui.zxzdachuipro.cd;

import com.dachui.zxzdachuipro.aspect.Counter;
import com.dachui.zxzdachuipro.config.CDConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @Author: zxz
 * @Date: 2024-06-20-17:35
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDConfig.class)
public class CDTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule();

    @Autowired
    @Common
    private CD cd;

//    @Autowired
//    private CdImpl cdImpl;

    @Autowired
    private CDPlayer player;

    @Value("${test.value}")
    private String appName;

    @Autowired
    private Counter counter;

//    @Value("#{cdImpl.artist?.toLowerCase()}")
//    private String artist;
//
//    @Value("#{T(java.lang.Math).PI}")
//    private String pi;

    @Test
    public void cdNotNull(){
        assertNotNull(cd);
    }

    @Test
    public void cdPlayer(){
        player.play();
    }

    @Test
    public void cdSelfPlay(){
        cd.play();
    }

    @Test
    public void countTest(){
        cd.playWithNumber(1);
        cd.playWithNumber(1);
        cd.playWithNumber(1);
        cd.playWithNumber(2);
        cd.playWithNumber(2);
        cd.playWithNumber(3);
        cd.playWithNumber(3);

        assertEquals(3, counter.getCount(1));
        assertEquals(2, counter.getCount(2));
        assertEquals(2, counter.getCount(3));
    }

    @Test
    public void valueTest(){
        System.out.println(appName);
    }

    @Test
    public void addPlayAspectTest(){
    }

//    @Test
//    public void artistTest(){
//        System.out.println(artist);
//        System.out.println(pi);
//    }
}
