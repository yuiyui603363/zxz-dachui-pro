package com.dachui.zxzdachuipro.aspect;

import com.dachui.zxzdachuipro.cd.AddPlay;
import com.dachui.zxzdachuipro.cd.AddPlayImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @Author: zxz
 * @Date: 2024-06-25-15:40
 * @Description:
 */
@Aspect
public class AddAspect {
    @DeclareParents(value = "com.dachui.zxzdachuipro.cd.CD+", defaultImpl = AddPlayImpl.class)
    public static AddPlay addPlay;
}
