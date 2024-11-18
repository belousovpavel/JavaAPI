package lesson5;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class TextNumber {
    /**
     * Задан текст. Нужно посчитать популярности длин строк.
     *
     *
     *
     */
    public static void main(String[] args) {
        String text = "В глубине горного ущелья, где свет пробивается сквозь густую листву, " +
                "лежит древнее озеро, изумрудные воды которого хранят тайны тысячелетий. " +
                "Легенды о нем передавались из поколения в поколение, рассказывая о таинственных существах," +
                " которые, согласно слухам, охраняют его кристально чистые глубины от непрошенных гостей.";

        // 1-> [в,о]
        // 2-> [из,от]
        // и так далее

        String[] words = text.split("[.,]{0,1}\\s++"); // Один или больше пробелов, точка или запятая
        Map<Integer, List<String>> stats = new HashMap<>();
        for (String word : words) {
            // Отбросить знаки препинания
            String pureWord = word.toLowerCase();

            int length = pureWord.length();
            if (!stats.containsKey(length)) {
                stats.put(length, new ArrayList<>(Arrays.asList(pureWord)));
            }else {
                List<String> otherWords = stats.get(length);
                otherWords.add(pureWord);
                stats.put(length, otherWords); // Необязательно
            }
        }
        System.out.println(stats);
    }
}
