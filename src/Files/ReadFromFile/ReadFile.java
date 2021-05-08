package Files.ReadFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(
                new FileReader("src/Files/ReadFromFile/file.txt"));) {
            StringBuilder stringBuilder = new StringBuilder();
            String s;

            Scanner scanner = new Scanner(System.in);
            String word = scanner.next();
            int i = 0;
            while((s = bufferedReader.readLine()) != null) {
                if(s.contains(word)) {
                    System.out.println(s);
                }
                stringBuilder.append(++i + ". " + s + "\n");
            }

            System.out.println(stringBuilder.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
