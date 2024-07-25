package com.dachui.zxzdachuipro.cd;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

/**
 * @Author: zxz
 * @Date: 2024-07-09-15:11
 * @Description:
 */
public class CommonTest {


    public static void main(String[] args){

//        long start = System.currentTimeMillis();
//
//        Long sum = 0L;
//        for(long i = 0; i<=Integer.MAX_VALUE; i++){
//            sum += i;
//        }
//        System.out.println(sum + " spend:" + (System.currentTimeMillis() - start));



        try(MySource mySource = new MySource()){
            System.out.println("do something....");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

@EqualsAndHashCode
@ToString
class MySource implements Closeable{

    private String name;

    private String word;

    public MySource() {
        System.out.println("contract");
    }

    @Override
    public void close() throws IOException {
        System.out.println("close!!!");
    }
}