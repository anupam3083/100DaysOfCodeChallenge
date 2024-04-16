class Solution {
    public int maxProduct(int[] nums) {
        
        int mx=Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>mx){
                smx=mx;
                mx=nums[i];
            }
            else if(nums[i]>smx){
                smx=nums[i];
            }
        }
        System.out.println(mx+"  "+smx);
        return (mx-1)*(smx-1);
    }
}