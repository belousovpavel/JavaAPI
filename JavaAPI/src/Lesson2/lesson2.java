package Lesson2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class lesson2 {
    public static void main(String[] args) {

     //   stringPool();
//        System.out.println(buildString(8,'1', '2'));
//        String mail = "manager@gmail.com";
//        System.out.println(extractDomainName("manager@gmail.com"));
      //  System.out.println(compress("aaaabbbcdd"));

        String s = "abchhuihgyg";

        int length = s.length(); // длина строки
        char c = s.charAt(2); // элемент строки по индексу
        String substring = s.substring(5); // подстрока, начина с 5 символа
        String substring1 = s.substring(5,7); // подстрока (5,7) символы
        String lowerCase = s.toLowerCase(); // переводит строку в нижний регистр
        String upperCase = s.toUpperCase(); // переводит строку в нижний регистр
        String replace = s.replaceAll("@", "");
        boolean startsWith = s.startsWith("abcde"); // начинается ли строка с данного префикса
        boolean endsWith = s.endsWith("ghi");
        String trim = s.trim(); // обрезает пробелы спереди и сзади
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        s.isBlank(); // строка пустай или из пробелов
        char[] tocharArray = s.toCharArray(); // получить массив символов

        String text = "I am Java developer";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

    }

    /**
     * Дано электронна почта. Нужно найти доменное имя сотрудника.
     * manager@gmail.com -> manager
     */

    static String extractDomainName(String mail) {
        // 1. Нужно найти @.
        // 2. Взять часть строки до собаки
        int index = mail.indexOf("@");
        return mail.substring(0, index);
//        return mail.replaceAll("@.*", "");
    }

    /**
     * Напишите метод, который сжимает строку. Пример:
     * aaaabbbcdd -> a4b3cd2
     */

    static String compress(String source){
        String result = "";
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            if (source.charAt(i-1) == source.charAt(i)) {
                count ++;
            }
            else {
                result += String.valueOf(source.charAt(i-1));
                if (count > 1){
                    result += count;
                }
                count = 1;
            }
        }
        result += String.valueOf(source.charAt(source.length()-1));
        if (count > 1){
            result += count;
        }
        return result;
    }

    /**
     * Дано четное число n и символы c1 c2. Нужно создать строку c1c2c1c2...c1c2 длины n.
     */

    static String buildString(int n, char c1, char c2) {
        String s = String.valueOf(c1);
        String temp = s + String.valueOf(c2);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n / 2 ; i++) {
           // str += temp;
            str.append(temp);
        }
//        String append = String.valueOf(c1) + c2;
//        return append.repeat(n/2);

        return str.toString();
    }

    private static void stringPool() {
        String s1 = "string";
        String s2 = "string";
        String s3 = new String("string");
        String s4 = new String("string");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // false

        String intern = s3.intern(); // помещает его в String table, имеет ссылку на String table
        System.out.println(intern == s1); // true
        System.out.println(intern == s3); // false

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
        System.out.println(Objects.equals(s1,s2));
    }
}
