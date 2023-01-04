package com.hormozhalimi;

import com.hormozhalimi.generics.GenericList;
import com.hormozhalimi.generics.User;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<User>();
        list.add(new User());
        User user = list.get(0);
        System.out.println(user);



    }
}