package com.ironhack.IntList;

public class IntArray implements IntList{

    private int[] array;
    private int counter;

    public IntArray() {
        array = new int[10];
    }

    public void add(int value) {
        if (counter < array.length) {
            array[counter] = value;
            counter++;
        } else {
            int newLength = array.length + array.length/2;
            int[] newArray = new int[newLength];

            for (int i = 0; i < array.length; i++) {

                newArray[i] = array[i];
            }

            newArray[counter++] = value;
            array = newArray;

        }

    }

    public int get(int id) {
        return 0;
    }

    public int[] getFullArray() {
        return array;
    }
}
