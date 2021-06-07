package com.bremick.javase.exercise;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(200);

        System.out.println(c.size());

        Iterator it=c.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        Object[] array=c.toArray();

        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
