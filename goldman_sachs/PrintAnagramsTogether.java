package revisewitharsh.goldman_sachs;

import java.util.ArrayList;
import java.util.List;

public class PrintAnagramsTogether {

    public static void main(String[] args) {
        System.out.println(Anagrams(new String[]{"act", "god", "cat", "dog", "tac"}));
    }

    public static List<List<String>> Anagrams(String[] stringList) {
        List<List<String>> resultList = new ArrayList<>();
        boolean[] isVisited = new boolean[stringList.length];
        for (int i = 0; i < stringList.length - 1; i++) {
            if (!isVisited[i]) {
                List<String> anagramList = new ArrayList<>(List.of(stringList[i]));
                for (int j = i + 1; j < stringList.length; j++) {
                    if (!isVisited[j] && areAnagrams(stringList[i], stringList[j])) {
                        anagramList.add(stringList[j]);
                        isVisited[j] = true;
                    }
                }
                isVisited[i] = true;
                resultList.add(anagramList);
            }
        }
        if (!isVisited[stringList.length - 1]) {
            resultList.add(new ArrayList<>(List.of(stringList[stringList.length - 1])));
        }
        return resultList;
    }

    public static boolean areAnagrams(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        } else {
            int[] frequency1 = new int[26];
            int[] frequency2 = new int[26];
            for (char c : firstWord.toCharArray()) {
                frequency1[c - 'a']++;
            }
            for (char c : secondWord.toCharArray()) {
                frequency2[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (frequency1[i] != frequency2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
