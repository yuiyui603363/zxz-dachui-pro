package com.dachui.zxzdachuipro.cd;

import org.springframework.stereotype.Component;

/**
 * @Author: zxz
 * @Date: 2024-06-20-17:33
 * @Description:
 */
@Component
public class CdImpl implements CD{
    public static String title = "bai_jin_hui_lang";
    public static String artist = "ZL";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }


    @Override
    public void playWithNumber(int number) {
        System.out.println("Playing " + number);
    }
}
