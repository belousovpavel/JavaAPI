package Lesson1;

import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ваше Имя: ");
        String line = sc.nextLine();
        System.out.println("Hello " + line);
    }
}

