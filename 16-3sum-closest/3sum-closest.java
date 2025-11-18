import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;

        // Initialize result with any valid three-sum
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int current = nums[i] + nums[low] + nums[high];

                // update closest if needed
                if (Math.abs(current - target) < Math.abs(closest - target)) {
                    closest = current;
                }

                if (current < target) {
                    low++;
                } else if (current > target) {
                    high--;
                } else {
                    // if equal to target, this is the best possible answer
                    return current;
                }
            }
        }

        return closest;
    }
}
