class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1); 
        int sum = 0;
        int count = 0;

        
        for (int num : nums) {
            
            sum += num;

            
            if (sumCountMap.containsKey(sum - k)) {
                count += sumCountMap.get(sum - k);
            }

            
            sumCountMap.put(sum, sumCountMap.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}