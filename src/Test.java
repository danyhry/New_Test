

public class Test {
    public static void main(String[] args) {
        int x = 153;
        int invertedNumber = 0;
        int copyOfX = x;

        while(copyOfX != 0) {
            invertedNumber = invertedNumber * 10 + copyOfX % 10; // 351
            copyOfX = copyOfX / 10;
        }

        System.out.println(invertedNumber == x);
    }
}





