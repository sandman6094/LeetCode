package FirstUniqueCharacterinaString;

public class Solution {
    public int firstUniqChar(String s) {
        char[] sChar = s.toCharArray();
        int[] bucket = new int[26];

        for (char c : sChar) {
            bucket[c - 'a']++;
        }

        for (int i = 0; i < sChar.length; i++) {
            if (bucket[sChar[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
