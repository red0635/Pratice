package com.pinc.practice.sort;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 5, 11, 8, 4, 9};
//        System.out.println("============选择排序============");
//        Sort s = new SelectorSort(arr);
//        s.sort();
//        s.output();
//        System.out.println("============冒泡排序============");
//        Sort s1 = new BubbleSort(arr);
//        s1.sort();
//        s1.output();
//        System.out.println("============插入排序============");
//        Sort s2 = new InsertSort(arr);
//        s2.sort();
//        s2.output();
//        System.out.println("============快速排序============");
//        Sort s3 = new QuickSort(arr);
//        s3.sort();
//        s3.output();
//        System.out.println("============堆排序============");
//        MyHeap s3 = new MyHeap(1);
//        s3.heapSort(arr);
//        for (int a : arr) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//         System.out.println("============计数排序============");
//         Sort s4 = new CountSort(arr);
//         s4.sort();
//         s4.output();
          System.out.println("============基数排序============");
          RadixSort s4 = new RadixSort();
          s4.radixSort(arr);
          for (int a : arr) {
            System.out.print(a + " ");
          }
    }

}
