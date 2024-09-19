package lesson2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово для проверки: ");
        String word = sc.nextLine();
        boolean Polindrome = isPolindrome(word);
        System.out.println(Polindrome);
    }

    static boolean isPolindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

}
