class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();
        for(int i=0;i<length;i++){
            int value = columnTitle.charAt(i)-'A' + 1;
            result = result*26 + value;
        }
        return result;
        
    }
}