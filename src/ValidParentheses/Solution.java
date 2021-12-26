package ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stc = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stc.push(c);
                continue;
            }

            if (stc.isEmpty()) {
                return false;
            }

            switch (c) {
                case ']':
                    if (stc.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stc.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (stc.pop() != '(') {
                        return false;
                    }
                    break;
            }
        }

        return (stc.isEmpty());
    }
}
