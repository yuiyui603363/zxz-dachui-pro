package com.dachui.zxzdachuipro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dachui.zxzdachuipro.mapper")
public class ZxzDachuiProApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxzDachuiProApplication.class, args);
    }

}
