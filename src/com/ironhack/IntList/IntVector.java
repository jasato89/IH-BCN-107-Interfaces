package com.ironhack.IntList;

public class IntVector implements IntList {

    private int[] numbers;
    private int counter;

    public IntVector() {
        this.numbers = new int[10];
        counter = 0;
    }

    public void add(int value) {

        if (counter > numbers.length) {
            numbers[counter] = value;
            counter++;
        } else {
            int newLength = numbers.length + numbers.length;
            int[] newArray = new int[newLength];

            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }

            newArray[counter++] = value;
            numbers = newArray;
        }


    }


    public int get(int id) {
        return 0;
    }
}
