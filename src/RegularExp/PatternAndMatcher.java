package RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
    public static void main(String[] args) {
        String text = "Hello Guys! I send you my email joe@gmail.com so we can keep in touch.\n" +
        "My address: qweqweqwe@yandex.ru";
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1)); // id в круглых скобках
        }
    }
}
