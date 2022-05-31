package com.company;


import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();
        System.out.println(list.contains(10));

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);



        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        //numbers.removeAt(4);
        System.out.println(numbers.indexOf(90));
        numbers.print();

//	int [] numbers = new int[3];  //to allocated memory for the array
//        numbers[0] =10; //set the items
//        numbers[1] =20;
//        numbers[2] =30;
//        System.out.println(Arrays.toString(numbers));
//
//    int [] numbers2 ={10, 20, 30}; //initialized the array
//        System.out.println(numbers2.length);
//
//        //new ArraySample();
    }
}
