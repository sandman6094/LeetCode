package IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index] = nums1[i];
                    index++;
                    nums2[j] = -1;
                }
            }
        }

        return result;
    }
}
