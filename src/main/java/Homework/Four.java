package Homework;

public class Four {
    private static int result;

    //Посчитать сумму цифр заданного числа
    public static void main(String[] args) {
        System.out.println(sumNumbers(25));
    }

    public static int sumNumbers(int number) {
        int result = 0;
        while (number != 0)
            result += number % 10;
        number /= 10;
        return result;
    }
}
