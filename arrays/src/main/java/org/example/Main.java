package org.example;

public class Main {
    public static void main(String[] args) {
        int[]numbers = new int[9];
        numbers[0] = 11;
        numbers[1] = 12;
        numbers[2] = 13;
        numbers[3] = 14;
        numbers[3] = 15;
        numbers[4] = 16;
        numbers[5] = 17;
        numbers[6] = 18;
        numbers[7] = 19;
        numbers[8] = 20;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}