package com.easyapp.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Property {
    private final static Map<String, String> configMap = new ConcurrentHashMap<String, String>();

    public static String getString(String key) {
        return configMap.get(key);
    }

    public static int getInt(String key) throws InvalidPropertyKeyException {
        String val = configMap.get(key);
        if (val != null) {
            return Integer.parseInt(val);
        }
        throw new InvalidPropertyKeyException(String.format("Key: %s not found", key));
    }

    public static void addAll(Map<String, String> configs) {
        configMap.putAll(configs);
    }
}