package lesson4;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WordRememberApp {
    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя строку вида text~num
     *
     * 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num
     * 2. Если введено print~num, выводит строку из позиции num в связный список и удаляет ее из списка.
     * 3. Если введено exit, то завершаем программу
     *
     * java~4
     * python~2
     * print~4 -> java
     * print~2 -> python
     * print~3 -> throw new NoSuchElementExeption
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> storage = new LinkedList<String>();

        while (true){
            String command = scanner.nextLine();

            if (command.equals("exit")){
                System.exit(0);
            }

            String[] arguments = command.split("~");
            if (arguments.length != 2){
                System.err.println("Wrong number of arguments");
                continue;
            }

            String word = arguments[0];
            int index = -1;
            try{
                index = Integer.parseInt(arguments[1]);
            }
            catch (NumberFormatException e){
                System.err.println("Второй аргумент команды не является числом");
                continue;
            }

            if ("print".equals(word)){
                String element = storage.remove(index);
                if (element == null){
                    throw new NoSuchElementException();
                }
                System.out.println(element);
            } else{
                while (storage.size() < index){
                    storage.add(null);
                }

                storage.add(index, word);
            }
            System.out.println(storage);
        }
    }
}
