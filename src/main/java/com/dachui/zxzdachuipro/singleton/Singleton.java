package com.dachui.zxzdachuipro.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: zxz
 * @Date: 2024-07-09-10:43
 * @Description:
 */
public class Singleton implements Serializable {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        if(instance != null){
            throw new RuntimeException("sington is not allow a new one");
        }
    }

    public static Singleton getInstance(){
        return instance;
    }


    private Object readResolve() throws ObjectStreamException {
        return instance;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //新建
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if(singleton1.hashCode() != singleton2.hashCode()){
            System.out.println("ERROR");
        }else{
            System.out.println("TEST1-PASS");
        }


        //反射
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton singleton3 = constructor.newInstance();
//        if(singleton1.hashCode() != singleton3.hashCode()){
//            System.out.println("ERROR");
//        }else{
//            System.out.println("TEST2-PASS");
//        }

        //序列化
        Singleton singleton4 = Singleton.getInstance();

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("EnumObject"));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("EnumObject"))){
            outputStream.writeObject(singleton4);
            Singleton singleton5 = (Singleton)objectInputStream.readObject();
            if(singleton4.hashCode() != singleton5.hashCode()){
                System.out.println("ERROR");
            }else{
                System.out.println("TEST3-PASS");
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
