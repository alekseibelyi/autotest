public class NumberChecker {

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker();

        // Тестовые данные
        int[] testNumbers = {0};

        System.out.println("Проверка чисел на четность:");
        System.out.println("=============================");

        for (int number : testNumbers) {
            String result = checker.isEven(number) ? "ЧЕТНОЕ" : "НЕЧЕТНОЕ";
            System.out.printf("Число %4d - %s%n", number, result);
        }
    }
}