package com.dachui.zxzdachuipro.cd;

/**
 * @Author: zxz
 * @Date: 2024-06-20-17:32
 * @Description:
 */
public interface CD {

    void play();

    default void playWithNumber(int number){}
}
