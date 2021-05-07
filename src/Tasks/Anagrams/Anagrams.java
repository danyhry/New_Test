package Tasks.Anagrams;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc", "bac"));
    }

    public static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2))
            return true;
        else
            return false;
    }
}
