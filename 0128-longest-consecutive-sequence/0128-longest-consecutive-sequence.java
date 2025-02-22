class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        int small =  Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;
        for(int i=0;i<n;i++){
            if(nums[i] -1 == small){
                count++;
                small = nums[i];
            } else if(nums[i] != small){
                count = 1;
                small = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}