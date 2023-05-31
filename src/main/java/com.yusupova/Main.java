package com.yusupova;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[]{5, 4, 1, 3, 10, 8};
        SortingExample.printUnsortedArray(numbers);
        SortingExample.printSortedArray(numbers);

        List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
        SortingExample.printUnsortedList(list);
        SortingExample.printSortedList(list);

        Map<String, Integer> map = Map.of("Ivan", 29, "Olga", 25, "Egor", 40);
        SortingExample.printUnsortedMap(map);
        SortingExample.printSortedMap(map);

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("kiwi");

        ListMethodsExample.checkContent(fruits, "kiwi");
        ListMethodsExample.printValueFromIndex(fruits, 0);

        Set<String> set = new HashSet<>();
        set.add("cat");
        set.add("dog");
        set.add("pig");
        set.add("leon");
        set.add("monkey");

        SetMethodsExample.addAnimal(set, "cat");
        SetMethodsExample.getSetSize(set);
        SetMethodsExample.addAnimal(set, "cow");
        SetMethodsExample.getSetSize(set);
        SetMethodsExample.removeSetElement(set, "dog");

        Map<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");

        MapMethodsExample.printEntrySet(monthMap);
        MapMethodsExample.printValue((monthMap));
        MapMethodsExample.printKeySet((monthMap));
    }
}
