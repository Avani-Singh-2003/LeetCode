class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> charIndexMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        
        for(int right =0;right<n;right++){
            char currentChar = s.charAt(right);
            
            if(charIndexMap.containsKey(currentChar)){
                left =Math.max(left,charIndexMap.get(currentChar)+1);
            }
            charIndexMap.put(currentChar,right);
            maxLength = Math.max(maxLength,right-left+1);
        }
        
        return maxLength;
    }
}