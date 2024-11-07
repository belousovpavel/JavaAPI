package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lesson4 {
    public static void main(String[] args) {
        lists();
        stackAndQueue();


    }

   private static void stackAndQueue() {
        // Collection -> List Интерфейс -> ArrayList, LinkedList
        // Collection -> Queue -> Deque -> ArrayDeque, LinkedList
        // Collection -> Set


        // Stack LIFO Last In First Out
        // Queue FIFO First In First Out

        // push or add
        // get or pop or remove

        // Stack
        // add 1 2 3 4 5
        // pop 5 4 3 2 1

        // Queue
        // add 1 2 3 4 5
        // pop 1 2 3 4 5

        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

//        list.addFirst();
 //       list.removeFirst();

    }

    private static void lists() {
        // [v1, v2, ... vn]
        ArrayList<String> arrayList = new ArrayList<>();

        // head, tail
        // [v1] <-> [v2] <-> ... <-> [vn]
        LinkedList<String> linkedList = new LinkedList<>();

        // Имеется список из 1_000_000 элементов. Нужно удалить по индексу.
        // 1. Чтобы удалить из ArrayList, нужно удалить элемент по индексу, и потом сдвинуть все
        // 2. Чтобы удалить из LinkedList, нужно дойти до элемента по индексу
        // поменять ссылку у предыдущего и следующего
    }
}
