package RegularExp;

import java.util.Arrays;

public class RegExp {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));

        String b = "Hello.there.hey";
        String[] words2 = b.split("\\.");
        System.out.println(Arrays.toString(words2));

        String c = "Hello1231241there1231234hey5123132eqwe";
        String[] words3 = c.split("\\d+");
        System.out.println(Arrays.toString(words3));

        String bb = "Hello there hey";
        String modifiedString = b.replace(" ", ".");
        System.out.println(modifiedString);

        String d = "Hello12312there123124hey312312";
        String modString = d.replaceAll("\\d+", "-");

        System.out.println(modString);

        String modString2 = d.replaceFirst("\\d+", ".");
        System.out.println(modString2);
    }
}
