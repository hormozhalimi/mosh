package com.hormozhalimi;

import com.hormozhalimi.generics.GenericList;
import com.hormozhalimi.generics.User;
import com.hormozhalimi.generics.Utils;

public class Main {
    public static void main(String[] args) {
/*
         var user1 = new User(10);
        var user2 = new User(20);
        if(user1.compareTo(user2) < 0)
            System.out.println("user1 is smaller than user2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 is equal to user2 ");
        else
        System.out.println("user1 is greather then user2");
 */
    var max = Utils.max(new User(10), new User(20));
    System.out.println(max);
    }
}