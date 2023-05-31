package com.yusupova;

import java.util.List;

public class ListMethodsExample {

    public static void checkContent(List<String> list, String fruit) {
        if (list.contains(fruit)) {
            System.out.println("My favourite fruit: " + fruit);
        } else {
            System.out.println("No favorite fruit");
        }
    }

    public static void printValueFromIndex(List<String> list, int index) {
        System.out.println(index + ": " + list.get(index));
    }
}
