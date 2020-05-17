package com.easyapp.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Property {
    private final static Map<String, String> configMap = new ConcurrentHashMap<String, String>();

    public static String getString(String key) {
        return configMap.get(key);
    }

    public static Integer getInt(String key) {
        String val = configMap.get(key);
        if (val != null) {
            return Integer.parseInt(val);
        }
        return null;
    }

    public static void addAll(Map<String, String> configs) {
        configMap.putAll(configs);
    }
}