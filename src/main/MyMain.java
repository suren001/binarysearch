package main;

import binarysearchiterative.MyBinarySearchIterative;

public class MyMain {
    public static void main(String[] args) {
        int[] arr1={10,20,30,40,50,60,70,80,90,100};
        int searchelement=70;
        MyBinarySearchIterative ob=new MyBinarySearchIterative(arr1);
        int result=ob.binarySearchIterative(searchelement);
        System.out.println(result);
    }
}
