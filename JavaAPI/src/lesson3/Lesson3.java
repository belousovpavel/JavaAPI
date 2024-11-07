package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson3 {
    public static void main(String[] args) {
        //intro();
       // timer();

//        ArrayList<String> strings = new ArrayList<>(   removeDuplicates
//                Arrays.asList("a", "b", "c","a", "b", "d"));
//        removeDuplicates(strings);
//        System.out.println(strings);

        ArrayList<String> strings = new ArrayList<>(
                Arrays.asList("str","1","-5","abcd"," "));
        cleanUp(strings);
        System.out.println(strings);

    }

    /**
     *Удалить из списка дубликаты
     */
    private static void removeDuplicates(ArrayList<String> strings) {
        ArrayList<String> unique = new ArrayList<>();
        for (String s : strings) { // foreach
            if (!unique.contains(s)) {
                unique.add(s);
            }
        }
        strings.clear();
        strings.addAll(unique);


//        int index = 0;
//        while(index < strings.size()) {
//            String element = strings.get(index);
//            int index2 = index + 1;
//            while (index2 < strings.size()) {
//                String element2 = strings.get(index2);
//                if (element.equals(element2)) {
//                    strings.remove(index2);
//                }else {
//                    index2 ++;
//                }
//            }
//            index ++;
//        }
    }

    /**
     * Дан массив в котором некоторые строки являются числами.
     * Нужно удалить все строки.
     * ["str","1","-5","abcd"," "] -> ["-1","5"]
     */
    private static void cleanUp(ArrayList<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (!isInteger(next)){
                iterator.remove();
            }
        }

//        for (int i = 0; i < strings.size(); i++) {
//        String element = strings.get(i);
//            if (!isInteger(element)) {
//            strings.remove(i);
//            i--;
//            }
//        }
    }

    private static boolean isInteger(String element) {
        return element.matches("[-]{0,1}\\d+");
    }


    private static void timer(){
        int size = 10_000_000;
        // Измерить время добавлеия миллиона элементов в списки
        ArrayList<Integer> defaultCapacity = new ArrayList<>();
        // Количество милисикунд
        long start = System.currentTimeMillis();
        //код
        for (int i = 0; i < size; i++) {
            defaultCapacity.add(i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Время добавления: " + time);

        ArrayList<Integer> customCapacity = new ArrayList<>(size);
        // Количество милисикунд
        start = System.currentTimeMillis();
        //код
        for (int i = 0; i < size; i++) {
            defaultCapacity.add(i);
        }
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("Время добавления: " + time);

    }

    private static void intro() {
        //generic обобщение
        ArrayList<Integer> list = new ArrayList<>();
        // size
        // add(element)
        // add(index, element)
        // remove(index) , remove(index, element)
        // set(index, element) - замена элемена
        // clear
        // sort
        // index.of - узнать индекс объекта
        //

//        ArrayList<Integer> list2 = new ArrayList<>(20);

        System.out.println(list.size());
        list.add(1);
        System.out.println(list.size());
        list.add(2);
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list);
        list.set(0, 3);
        System.out.println(list);
    }
}
