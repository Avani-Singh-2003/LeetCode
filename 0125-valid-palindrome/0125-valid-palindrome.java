class Solution {
    public boolean isPalindrome(String s) {
       
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String p = s.toLowerCase();
        for(int i=0;i<p.length();i++){
            if(p.charAt(i) != p.charAt(p.length()-1-i)){
                return false;
            }
        }
        return true;
        
    }
}