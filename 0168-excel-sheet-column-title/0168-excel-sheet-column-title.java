class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber%26;
            char ch = (char)(rem + 'A');
            result.insert(0,ch);
            columnNumber /= 26;
        }
        return result.toString();
    }
}