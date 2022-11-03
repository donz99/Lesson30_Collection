package Lesson30_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class main {
    public static void main(String[] args) {
        final List<Integer> l1 = new ArrayList<>();
        final List<Integer> l2 = new ArrayList<>();
        l1.add(1); l1.add(2); l1.add(3); l1.add(4); l1.add(5);
        /*SOLUTION*/

        l2.addAll(l1);
        l1.clear();
        System.out.println("l1: " + l1);
        System.err.println("l2: " + l2);

        Iterator<Integer> it = l2.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }


    }
}
