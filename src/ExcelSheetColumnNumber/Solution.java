package ExcelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String columnTitle) {
        char[] list = columnTitle.toCharArray();
        int count = 0;
        int result = 0;

        for (int i = list.length - 1; i >= 0; i--) {
            result += ( ((int)(list[i] - 64)) * ( (int) Math.pow(26, count)));
            count++;
        }

        return result;
    }
}
