class Solution {
    public int maxSubArray(int[] nums) {
     
        if(nums.length==1){
            return nums[0];
        }
        int mxsm=nums[0];
        int crsm=0;
        for(int i=0;i<nums.length;i++){
            crsm+=nums[i];
            mxsm=crsm>mxsm?crsm:mxsm;
            if(crsm<0)
                crsm=0;
            
        }
        return mxsm;
    }
}