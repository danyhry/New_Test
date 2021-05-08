package Strings;

public class CountOfSymbolsWithoutSpace {
    public static void main(String[] args) {
        String stroka = "Hello qwe.";
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder(stroka);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i) == ' ') {
                continue;
            }
            count++;
        }

        System.out.println("Count " + count);
    }
}
