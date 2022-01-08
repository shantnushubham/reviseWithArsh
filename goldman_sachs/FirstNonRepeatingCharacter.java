package revisewitharsh.goldman_sachs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(nonRepeatingCharacter("hello"));
        System.out.println(nonRepeatingCharacter("zxvczbtxyzvy"));
    }

    public static char nonRepeatingCharacter(String S) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] charArray = S.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '$';
    }
}
