//package com.dachui.zxzdachuipro.generator;
//
//import com.baomidou.mybatisplus.generator.FastAutoGenerator;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
//import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
//import com.baomidou.mybatisplus.generator.query.SQLQuery;
//
//import java.nio.file.Paths;
//
///**
// * @Author: zxz
// * @Date: 2024-07-17-18:08
// * @Description:
// */
//public class CodeGenerator {
//    public static void main(String[] args){
//        FastAutoGenerator.create("jdbc:mysql://mysql077-sit.mid.io:2077/yh_srm_contractcenter_test?autoReconnect=true&allowMultiQueries=true&useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true",
//                        "usercenter_test", "usercenter_test123")
//                .dataSourceConfig(builder ->
//                        builder.databaseQueryClass(SQLQuery.class)
//                                .typeConvert(new MySqlTypeConvert())
//                                .dbQuery(new MySqlQuery())
//                )
//                .globalConfig(builder -> builder
//                        .author("Baomidou")
//                        .outputDir("/Users/zxz/project/zxz-dachui-pro/src/main/java")
//                        .commentDate("yyyy-MM-dd")
//                )
//                .packageConfig(builder -> builder
//                        .parent("com.dachui.zxzdachuipro")
//                        .entity("entity")
//                        .mapper("mapper")
//                        .service("service")
//                        .serviceImpl("service.impl")
//                        .xml("mapper.xml")
//                )
//                .strategyConfig(builder -> builder
//                        .addInclude("contract_report")
//                        .entityBuilder()
//                        .enableLombok()
//
//                )
//                .templateEngine(new FreemarkerTemplateEngine())
//                .execute();
//    }
//}
