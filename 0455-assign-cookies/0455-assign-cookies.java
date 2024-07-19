class Solution {
    public int findContentChildren(int[] g, int[] s) {
           Arrays.sort(g);
            Arrays.sort(s);
        int cs = 0;
        int cos = 0;
        while(cs<g.length && cos<s.length){
            if(s[cos] >= g[cs]){
                cs ++;
            }
            cos ++;
        }
        return cs;
    }
}