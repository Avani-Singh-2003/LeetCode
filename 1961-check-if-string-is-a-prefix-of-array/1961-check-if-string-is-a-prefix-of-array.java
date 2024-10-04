class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder b = new StringBuilder();
        for(String word : words){
            b.append(word);
                if(b.toString().equals(s)){
                    return true;
                }
                if(b.length()>s.length()){
                    return false;
                }
            
        }
        return false;
    }
}