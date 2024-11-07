package lesson3;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lekciya3 {

    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

    public static void main(String[] args) {
//        Object o = 1; GetType(o);
//        o = 1.2; GetType(o);
//        System.out.println(Sum(1,2));
//        System.out.println(Sum(1.2,3));
//        System.out.println(Sum("каша","маша"));// неверно
//        int[] a = new int[] {1,9};
//        int[] b = new int[3];
//        System.arraycopy(a,0,b,0,a.length);
//        for (int i : a){
//            System.out.printf("%d ", i);
//        }
//        for (int j : b){
//            System.out.printf("%d ", j);
//        }
//        ArrayList<String> list1 = new ArrayList<>(10);
//        ArrayList<Integer> list3 = new ArrayList<Integer>();
//        list3.add(2809);
//
//        for (Object o : list3) {
//            System.out.println(o);
//        }

        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("02");
        StringBuilder year = new StringBuilder("2015");
        StringBuilder[] date = new StringBuilder[] {day, month, year};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d.get(0));



    }
//    static void GetType(Object o) {
//        System.out.println(o.getClass().getName());
//    }
//
//    static Object Sum(Object a, Object b) {
//        if (a instanceof Double && b instanceof Double) { // instaneceof - является в Object
//            return (Object) ((Double) a + (Double) b);
//        }
//        else if (a instanceof Integer && b instanceof Integer) {
//            return (Object) ((Integer) a + (Integer) b);
//        }
//        else if (a instanceof Double && b instanceof Integer) {
//            return (Object) ((Double) a + (Integer) b);
//        }
//        else return 0;
//    }
}
