class Solution {
    public int[] twoSum(int[] numbers, int target) {
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // Traverse through the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if complement (target - numbers[i]) exists in the map
            if (map.containsKey(target - numbers[i])) {
                return new int[] { map.get(target - numbers[i]) + 1, i + 1 }; // return 1-based indices
            }
            // Otherwise, store the current number and its index
            map.put(numbers[i], i);
        }
        
        // If no solution is found, return an empty array (this is optional depending on the problem)
        return new int[0];
        
    }
}