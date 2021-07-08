package com.zlove.interview.extend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Base {

    public static void sysPrint() {
        System.out.println("--- Base ---");
    }

    public static int getKthMagicNumber(int k) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 1;
        if(k == 1)
            return 1;
        temp.add(1);
        while( i != k ){
            temp.add(temp.get(i-1)*3);
            temp.add(temp.get(i-1)*5);
            temp.add(temp.get(i-1)*7);
            i++;
            Collections.sort(temp, Comparator.comparingInt(o -> o));
        }
        return temp.get(k);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    class B extends A {

    }

    abstract static class A {

    }
}
