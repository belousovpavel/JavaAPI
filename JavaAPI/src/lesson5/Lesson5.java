package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson5 {
    public static void main(String[] args) {
    //    Teoriya();

        //hashMap();

        System.out.println(isIsomorth("add","egg"));
        System.out.println(isIsomorth("foo","bar"));
    }

    private static void hashMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("string", 6);
        System.out.println(map);

        // backets, 16 = [null, null ... null]
        map.put("java", 4);
        // key -> hash = hash(key) - целое число int
        // hash -> backet
        // if hash = 7 -> [null, null, ..., key(7 место), ..., null]
        // if hash = 18 -> bucket = 18 % 16 -> backet = 2
        // В нужную "корзинку" добавляется пара <key, value>

        map.put("python", 6);
        // key -> hash = hash(key)
        // Если корзинка уже занята
        // Проверяем ключи по equals
        // Если ключи равны по equals то заменем
        // Если не равны, то внутрь корзинки помещается список пар <key, value>

        // [null, null, [java=4, python =6], ..., null]

        System.out.println("java".hashCode());
    }

    private static void Teoriya() {
        //        List, Queue, Deque -> Collection
//        Map <String, String>
//        У интерфейсов есть методы без реализации
//       HashMap - реализация интерфейса Map, которая работает наоснове Hash таблицы
        HashMap<String, String> hashmap = new HashMap<>();

        // Добавление пары ключ-значение
        hashmap.put("key", "value");

        // Получение значения по ключу
        String valueByKey = hashmap.get("key");
        System.out.println(valueByKey); //"value"

        // Проверка наличия ключа
        boolean containsKey = hashmap.containsKey("key");
        System.out.println(containsKey); // true

        // Получение множества всех ключей
        Set<String> keys = hashmap.keySet();

        // Удаление пары по ключу
        hashmap.remove("key");

        // Удалить все пары
        hashmap.clear();

        // Проверить наличие значения
        hashmap.containsValue("value");

        // hashmap.putAll(hashmap);

        //Получение списка всех пар
        Set<Map.Entry<String, String>> entries = hashmap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
        }
    }


    /**
     * Даны две строки, написать метод, который вернет true,
     * если эти строк являются изоморфными
     */
    private static boolean isIsomorth(String first, String second) {
       if (first.length() != second.length()) {
           return false;
       }

       HashMap<Character, Character> map = new HashMap<>();
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();

        for (int i = 0; i < firstChar.length; i++) {
            char a = firstChar[i];
            char b = secondChar[i];
            if (!map.containsKey(a)) {
                map.put(a, b);
            }else{
                if (map.get(a) != b){
                    return false;
                }
            }
        }
        return true;
    }
}