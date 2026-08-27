package org.example;

public class bolsheMensheNull {
    public static void main(String[] args) {
        int[] numbers = {-5, 0, 5, -1, 4, 234, 0};

        for (int num : numbers) {
            // Прямое использование тернарного оператора
            System.out.println(num + " " + (num >= 0 ? true : false));
        }
    }
}