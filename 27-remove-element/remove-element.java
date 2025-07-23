class Solution {
    public int removeElement(int[] nums, int val) {
  
      int i = 0;
      int j = nums.length - 1;

    while (i <= j) {
        if (nums[i] == val) {
            // Swap nums[i] with nums[j]
            nums[i] = nums[j];
            j--; // shrink the valid range
        } else {
            i++; // move to next if current is not val
        }
    }
    return i;
}
}