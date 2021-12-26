package ContainsDuplicate;

import java.util.HashMap;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> list = new HashMap<>();

        for (int i : nums) {
            if (list.containsKey(i)) {
                return true;
            }

            else {
                list.put(i, true);
            }
        }

        return false;
    }
}
