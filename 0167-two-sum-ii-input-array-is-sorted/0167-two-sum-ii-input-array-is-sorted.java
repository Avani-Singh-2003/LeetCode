class Solution {
    public int[] twoSum(int[] numbers, int target) {
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        
        for (int i = 0; i < numbers.length; i++) {
            
            if (map.containsKey(target - numbers[i])) {
                return new int[] { map.get(target - numbers[i]) + 1, i + 1 }; // return 1-based indices
            }

            map.put(numbers[i], i);
        }
        
        
        return new int[0];
        
    }
}