package org.example;

public class chetNechet {

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        chetNechet checker = new chetNechet();

        // Тестовые данные
        int[] testNumbers = {0,1,2,3,4,5,6,7,8,9};

        System.out.println("Проверка чисел на четность:");
        System.out.println("=============================");

        for (int number : testNumbers) {
            String result = checker.isEven(number) ? "ЧЕТНОЕ" : "НЕЧЕТНОЕ";
            System.out.printf("Число %4d - %s%n", number, result);
        }
    }
}

