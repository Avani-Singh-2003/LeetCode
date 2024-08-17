class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+"); //Splits the string based on one or more spaces.
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length-1;i>= 0 ;i--){
    reversed.append(words[i]);
            if(i>0){
            reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}