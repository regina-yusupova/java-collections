package com.yusupova;

import java.util.*;

public class SortingExample {

    // сортировка массива
    public static void printUnsortedArray(int[] numbers) {
        System.out.println("The unsorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void printSortedArray(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("\nThe sorted array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    //сортировка коллекции List с помощью класса Collections
    public static void printUnsortedList(List<Integer> list) {
        System.out.println("\nThe unsorted list: " + list);
    }

    public static void printSortedList(List<Integer> list) {
        Collections.sort(list);
        System.out.println("\nThe sorted list: " + list);
    }

    //сортировка Map с помощью TreeMap
    public static void printUnsortedMap(Map<String, Integer> map) {
        System.out.println("\nThe unsorted map: " + map);
    }

    public static void printSortedMap(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new TreeMap<>(Comparator.comparing(map::get));
        sortedMap.putAll(map);
        System.out.println("\nThe sorted map: " + sortedMap);
    }
}
