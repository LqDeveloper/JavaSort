package com.company;


public class Tool {
    static public String bubbleSort(int[] arr) {

//        后面的是排好的
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    arr[j] = arr[j] + arr[j + 1];
//                    arr[j + 1] = arr[j] - arr[j + 1];
//                    arr[j] = arr[j] - arr[j + 1];
//                }
//            }
//        }
//        return arrToString(arr);
//       前面的是排好的
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                }
            }
        }

        return arrToString(arr);
    }


    //冒泡排序的优化
    static public String optimizeubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                    flag = true;
                }
            }
            if (!flag)break;
        }
        return arrToString(arr);
    }

    static private String arrToString(int[] arr) {
        StringBuffer arrString = new StringBuffer();
        for (int value : arr) {
            arrString.append(value + ",");
        }
        return arrString.toString();
    }

}
