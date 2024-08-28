public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start filling nums1 from the end
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the end of nums1
        
        // Compare elements from nums1 and nums2 and place them in the correct position in nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        
        // If there are remaining elements in nums2, add them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        
        // No need to check for remaining elements in nums1, as they are already in place
    }
}
