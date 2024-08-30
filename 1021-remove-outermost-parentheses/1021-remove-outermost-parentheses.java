class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int obracket = 0;
        for(char c : s.toCharArray()){
            if(c=='('){
                if(obracket>0){
                    result.append(c);
                }
                obracket++;
            } else if(c == ')'){
                obracket--;
                if(obracket > 0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}