class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        k = k % n; // Normalize k in case it's larger than the array length
        
        // Create a temporary array to store the rotated elements
        int[] temp = new int[k];
        // Store the last k elements in the temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        // Shift the remaining elements to the right
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        // Copy the rotated elements from temp to the beginning of nums
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
    }
}
}