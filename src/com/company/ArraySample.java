package com.company;

import java.util.Arrays;

class Array {
    //then declare the array
    private int [] items;
    private int count;

    //1st add a constructor
    public Array (int length){

        //initialize the array
        items = new int [length];
    
    }
    public void insert(int item){
        //if the array is full, resize it
        if (items.length == count){

        // create a new array(twice the size)
        int[] newItems =new int[count * 2];

        //copy all the existing items
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
        //Set "items" to this to this new array
        items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        // Validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // Shift the items to the left to fill the hole
        for (int i = index; i < count; i++)
            items[i] = items [i + 1];

        count--;
    }

    // Implementing the search operation
    public int indexOf (int item){
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;
        return -1;
    }

    //let's implement the print method
    public void print(){
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);

        }



}
