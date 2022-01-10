package Homework;

import java.util.Scanner;

public class Two {
    /* Напишите программу, которая определяет, является ли введенное число палиндромом?
    (Палиндром – число или текст, которые одинаково читаются слева направо и справа налево)*/
    public static void main(String args[]) {

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (pal(n)) {
            System.out.println("палиндром");
        } else {
            System.out.println("не палиндром");
        }
    }

    private static boolean pal(int n) {
        int pal = n;
        int reverse = 0;
        while (pal != 0) {
            int r = pal % 10;
            reverse = reverse * 10 + r;
            pal = pal / 10;
        }
        return n == reverse;
    }
}

