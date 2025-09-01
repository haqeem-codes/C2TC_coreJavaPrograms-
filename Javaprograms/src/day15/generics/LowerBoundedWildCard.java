package com.tnsif.day15.generics;

import java.util.List;

public class LowerBoundedWildCard {

    // This method accepts Integer or any of its superclasses (Number, Object)
    public static void displayNumbers(List<? super Integer> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
