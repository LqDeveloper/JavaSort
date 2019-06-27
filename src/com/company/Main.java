package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{3, 4, 1, 9, 2, 8, 6, 5, 7};
        String str = Tool.bubbleSort(a);
        System.out.println("冒泡排序:" + str);
    }
}
