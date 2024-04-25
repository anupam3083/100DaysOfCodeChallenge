class Solution {
    public int dominantIndex(int[] nums) {

        int mx=Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
                smx=mx;
                mx=nums[i];
                ind=i;
            }
            else if(nums[i]>smx){
                smx=nums[i];
            }
        }
        if(mx>=(2*smx)){
            return ind;
        }
        return -1;
        
    }
}