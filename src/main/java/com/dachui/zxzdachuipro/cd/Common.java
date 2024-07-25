package com.dachui.zxzdachuipro.cd;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: zxz
 * @Date: 2024-06-24-16:50
 * @Description:
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Common {
}
