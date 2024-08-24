class Solution {
    public int countBinarySubstrings(String s) {
        int previous = 0,currCount = 1,result=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                    currCount++;    
            } else{
                result+=Math.min(previous,currCount);
                previous = currCount;
                currCount = 1;
            }
        }
        result += Math.min(previous,currCount);//Add the last group combination
        return result;
    }
}