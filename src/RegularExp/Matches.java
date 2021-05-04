package RegularExp;

public class Matches {
    public static void main(String[] args) {

        /*
            regexlib.com

            \\d - одна цифра
            \\w - буква или цифра или знак подчёркивания
            \\w = [a-zA-Z_0-9]

            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символов до

            ( | | ) - одна строка из множества строк

            [a-zA-Z] - все английские буквы
            [0-9] - \\d

            [^abc] - все символы кроме [abc]

            . - любой символ

            {2} - 2 символа до (\\d{2})
            {2, } - 2 и больше символа до (\\d{2, })
            {2, 4} - от 2 и до 4 символов (\\d{2, 4})
        */

        String a = "2123";
        String b = "-123412";
        String c = "+192399219";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "g12312";
        System.out.println(d.matches("[a-zA-Z]\\d+"));

        String dd = "gasdas12312";
        System.out.println(dd.matches("[a-zA-Z]+\\d+"));

        String ddd = "g3asd1as12312";
        System.out.println(ddd.matches("[a-zA-Z31]+\\d+"));

        String e = "hello";
        String ee = "asdas";
        System.out.println(e.matches("[^abc]*")); // исключает символы
        System.out.println(ee.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ua)"));

        String f = "123";
        System.out.println(f.matches("\\d{2,}"));
    }
}
