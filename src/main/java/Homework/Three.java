package Homework;
/*Вывести число, которое является зеркальным
    отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.*/
public class Three {
    public static void main(String[] args) {
        int i = 123;
        String str = "" + i;
        StringBuffer buffer = new StringBuffer(i);
        buffer.reverse();
        System.out.println(buffer);
    }
}
