class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int largestElement = nums[n-1];
        int secondLargestElement = nums[n-2];

        return (largestElement-1)*(secondLargestElement-1);
    }
}