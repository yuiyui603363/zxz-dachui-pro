package com.dachui.zxzdachuipro.cd;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

import static java.time.Period.ofYears;

/**
 * @Author: zxz
 * @Date: 2024-06-25-15:39
 * @Description:
 */
public class AddPlayImpl implements AddPlay{
    @Override
    public void addPlay() {
        System.out.println("this is add playing~~~");
    }


    public static void main(String[] args) throws InterruptedException {
//        Instant start = Instant.now();
//        Thread.sleep(10_000);
//        Instant end = Instant.now();
//
//        Duration duration = Duration.between(start, end);
//        System.out.println(duration.getSeconds());


//        LocalDate localDate = LocalDate.now();
//        LocalDate nextYear = localDate.plus(ofYears(1));
//        System.out.println(localDate.until(nextYear, ChronoUnit.DAYS));
//        System.out.println(localDate.getDayOfWeek());

//        LocalDate start = LocalDate.of(2024, 3,1);
//        LocalDate end = LocalDate.of(2024, 4,1);
//        System.out.println(start.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));

//        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//
//        System.out.println(localDateTime.atZone(ZoneId.of("Asia/Aden")));
//        System.out.println(ZoneId.systemDefault());
//        localDateTime.atZone(2);

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine scriptEngine = manager.getEngineByName("groovy");
    }
}
