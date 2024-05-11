class Solution {
    public int maximumCount(int[] nums) {
        int c=0;
        int d=0;
        for(int i:nums){
            if(i<=0){
                d++;
                if(i<0){
                    c++;
                }
            }
        }
        return Math.max(c,nums.length-d);
    }
}