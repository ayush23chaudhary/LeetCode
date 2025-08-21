// Last updated: 8/21/2025, 12:06:09 PM
import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int target) {
        int initialCount = 0;
        for (int num : nums) {
            if (num == target) {
                initialCount++;
            }
        }
        
        int[] processedArray = nums.clone();
        int maxIncrease = 0;

        for (int value = 1; value <= 50; value++) {
            if (value == target) continue;

            int difference = target - value;
            int currentCount = 0;
            int localMax = 0;

            for (int num : nums) {
                if (num == value) {
                    currentCount++;
                } else if (num == target) {
                    currentCount--;
                }

                if (currentCount < 0) {
                    currentCount = 0;
                }

                if (currentCount > localMax) {
                    localMax = currentCount;
                }
            }

            if (localMax > maxIncrease) {
                maxIncrease = localMax;
            }
        }

        int finalFrequency = initialCount + maxIncrease;
        return finalFrequency;
    }
}
