package Tasks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter count: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // System.out.println(fib(n));

        // создание и заполнения массива
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }

        // вывод первых n чисел Фибоначчи
        for (int i = 0; i < n; ++i) {
            System.out.print(f[i] + " ");
        }
    }


    //slow
//    public static int fib(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }
}
