package com.pattern.proxy.dbRoute.db;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/12 0012 下午 10:18
 * @Version 1.0
 */
public class DynamicDataSourceEntity {

    public final static String DEFAULT_SOURCE = null;

    private DynamicDataSourceEntity(){}

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private static String get() {
        return local.get();
    }

    public static void set(String source) {
        local.set(source);
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

}
