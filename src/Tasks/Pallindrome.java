package Tasks;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(isPallindome(x));
    }

    public static boolean isPallindome(int x) {
        int number = 0;
        int copyOfX = x;

        while(copyOfX != 0) {
            number = number * 10 + copyOfX % 10;
            copyOfX = copyOfX / 10;
        }
        return number == x;
    }
}
