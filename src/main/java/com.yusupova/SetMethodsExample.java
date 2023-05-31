package com.yusupova;

import java.util.Set;

public class SetMethodsExample {

    public static void addAnimal(Set<String> set, String animal) {
        if (set.add(animal)) {
            System.out.println("Updated list: " + set);
        } else {
            System.out.println("Animal " + animal + " is already exist");
        }
    }

    public static void getSetSize(Set<String> set) {
        System.out.println("HashSet size = " + set.size());
    }

    public static void removeSetElement(Set<String> set, String animal) {
        set.remove(animal);
        System.out.println("Updated list: " + set);
    }
}
