class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> plus = new ArrayList<>();
        List<Integer> minus = new ArrayList<>();
        for(int num: nums){
        if(num >=0){
            plus.add(num);
        } else{
            minus.add(num);
            }
        }
        int[] result = new int[nums.length];
        int i=0,j=0,k=0;
        
        while(i< plus.size() && j<minus.size()){
        result[k++] = plus.get(i++);
        result[k++] = minus.get(j++);
        }
        
        while (i < plus.size()) {
            result[k++] = plus.get(i++);
        }

         while (j < minus.size()) {
            result[k++] = minus.get(j++);
        }

        return result;
    }
}