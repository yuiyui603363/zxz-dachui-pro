package com.dachui.zxzdachuipro.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: zxz
 * @Date: 2024-06-21-14:33
 * @Description:
 */
@Component("play")
public class CDPlayer {

    private CD cd;

    @Autowired
    public CDPlayer(CD cd) {
        this.cd = cd;
    }

    public void play(){
        cd.play();
    }
}
