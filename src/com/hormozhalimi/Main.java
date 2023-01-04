package com.hormozhalimi;

import com.hormozhalimi.generics.List;

public class Main {
    public static void main(String[] args) {

        var list = new List();
        list.add(1);

        int number = list.get(0);
        System.out.println(number);
    }
}