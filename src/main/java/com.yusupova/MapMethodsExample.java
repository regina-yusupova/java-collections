package com.yusupova;

import java.util.Map;

public class MapMethodsExample {

    public static void printEntrySet(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " month is " + entry.getValue());
    }

    public static void printValue(Map<Integer, String> map) {
        System.out.println(map.values());
    }

    public static void printKeySet(Map<Integer, String> map) {
        System.out.println(map.keySet());
    }


}
