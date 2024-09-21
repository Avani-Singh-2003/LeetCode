class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int nu = flowerbed.length;
        for(int i=0;i<nu;i++){
            if(flowerbed[i] == 0){
                boolean p = (i == 0) || (flowerbed[i-1] == 0);
                boolean ne = (i == nu-1) || (flowerbed[i+1] == 0);
                
                if(p && ne){
                    flowerbed[i] =1;
                    n--;
                    
                    if(n == 0){
                        return true;
                    }
                }
            }
        }
        return n<= 0;
    }
}