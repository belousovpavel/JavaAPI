package lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Пусть дан произвольный список целых чисел.
 *
 * 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
 * 2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 *
 * То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
 */

public class HomeWork {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        removeEven(list);
        System.out.println(list);
        int min = findMin(list);
        System.out.println(min);
        int max = findMax(list);
        System.out.println(max);
        double avg = Avg(list);
        System.out.println(avg);
    }

    private static void removeEven(ArrayList<Integer> list) {
        list.removeIf(x -> x % 2 == 0);
    }

    private static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for(int num : list){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    private static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for(int num : list){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    private static double Avg(ArrayList<Integer> list) {
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        return sum/list.size();
    }

}
