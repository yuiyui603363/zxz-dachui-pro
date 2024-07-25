package com.dachui.zxzdachuipro.po;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Author: zxz
 * @Date: 2024-06-25-17:33
 * @Description:
 */
public class FormData {

    @NotNull
    @Size(min = 5, max = 20)
    private String userName;

    @NotNull
    @Size(min = 5, max = 20)
    private String passWord;
}
