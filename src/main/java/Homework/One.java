package Homework;

public class One {
// найти сумму четных чисел и их количество в диапазоне от 1 до 99
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        sum = 0;
        for(i = 0; i <= 100; i++)
        {
            if(i%2 == 0)
            {
                sum = sum + i;
    }
}
        System.out.println(sum);
    }
}
