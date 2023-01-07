package com.hormozhalimi.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second){
        return (first.compareTo(second)<0) ? second : first;
    }

    public static void printUser(User user){
        System.out.println(user);
    }
    public static void printUsers(GenericList<?> user){


    }
}
