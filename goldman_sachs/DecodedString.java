package revisewitharsh.goldman_sachs;

import java.util.Deque;
import java.util.LinkedList;

public class DecodedString {

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(decodedString(s));
    }

    public static String decodedString(String s) {
        Deque<Integer> numberStack = new LinkedList<>();
        Deque<StringBuilder> stringStack = new LinkedList<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                stringStack.push(currentString);
                numberStack.push(num);
                currentString = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                StringBuilder prevStr = stringStack.pop();
                int count = numberStack.pop();
                while (count-- > 0) {
                    prevStr.append(currentString);
                }
                currentString = new StringBuilder(prevStr);
            } else {
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
}
