package com.demo.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CF {
    static void main() {
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(2, 4);

        ArrayList<Integer> arr_list = new ArrayList();
        arr_list.add(2);
        arr_list.add(7);
        arr_list.add(10);

        list.addAll(arr_list);

        System.out.println(list);
    }
}
