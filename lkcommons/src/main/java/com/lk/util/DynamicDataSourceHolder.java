package com.lk.util;

public class DynamicDataSourceHolder {
    public static final ThreadLocal<String>THREAD_DATA_SOURCE= new ThreadLocal<String>();

    public static void putDataSource(String name){
        THREAD_DATA_SOURCE.set(name);
    }
    public static String getDataSource(){
        return THREAD_DATA_SOURCE.get();
    }

    public static void clearDataSource(){

        THREAD_DATA_SOURCE.remove();
    }











}
