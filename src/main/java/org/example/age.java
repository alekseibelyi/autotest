package org.example;



public class age {

    public String checkAge(int age) {
        return age > 18 ? "Allowed" : "Denied";
    }

    public static void main(String[] args) {
        age checker = new age();

        System.out.println("=== Проверка возраста ===");
        System.out.println("========================");

        int[] ages = {15, 18, 19, 21, 30, 45, 17, 18, 20};

        for (int age : ages) {
            String result = checker.checkAge(age);
            System.out.printf("Возраст %2d: %s%n", age, result);
        }
    }
}