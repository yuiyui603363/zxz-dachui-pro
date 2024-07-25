package com.dachui.zxzdachuipro.config;

import com.dachui.zxzdachuipro.aspect.AddAspect;
import com.dachui.zxzdachuipro.aspect.Audience;
import com.dachui.zxzdachuipro.aspect.Counter;
import com.dachui.zxzdachuipro.cd.CD;
import com.dachui.zxzdachuipro.cd.CdImpl;
import com.dachui.zxzdachuipro.cd.Common;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: zxz
 * @Date: 2024-06-20-17:35
 * @Description:
 */
@EnableAspectJAutoProxy
@Configuration
@PropertySource("classpath:/application.properties")
public class CDConfig {
    @Bean
    @Common
    public CD cd(){
        return new CdImpl();
    }

//    @Bean
//    public CdImpl cdImpl(){
//        return new CdImpl();
//    }

//    @Bean
//    @OtherCountry
//    public CD blclcd(){
//        return new LTHCdImpl();
//    }

//    @Bean
//    public Audience audience(){
//        return new Audience();
//    }
//
//    @Bean
//    public Counter counter(){
//        return new Counter();
//    }
//
//    @Bean
//    public AddAspect addAspect(){
//        return new AddAspect();
//    }


//    @Bean(name = "cdPlayer")
//    public CDPlayer cdPlayer(@Common CD cd){
//        return new CDPlayer(cd);
//    }

}
