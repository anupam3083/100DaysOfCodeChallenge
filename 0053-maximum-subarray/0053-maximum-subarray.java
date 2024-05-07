class Solution {
    public int maxSubArray(int[] nums) {
     
        int mxsm=nums[0];
        int crsm=nums[0];
        for(int i=1;i<nums.length;i++){
            
            if(crsm<0){
                crsm=0;
            }
            crsm+=nums[i];
            System.out.println(crsm+"  "+mxsm);
            mxsm=crsm>mxsm?crsm:mxsm;
        }
        return mxsm;
    }
}