package MajorityElement;

public class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] buckets = new int[50000];
        int result = 0;

        for (int i : nums) {
            buckets[i - 1]++;
        }

        int n = nums.length / 2;

        for (int i = 0; i < 50000; i++) {
            if (buckets[i] >= n) {
                result = i + 1;
            }
        }

        return result;
    }
}
