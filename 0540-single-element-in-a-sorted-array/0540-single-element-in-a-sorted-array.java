class Solution {
    public int singleNonDuplicate(int[] nums) {
        
       /* int x=0;
        for(int i:nums){
            x^=i;
        }
        return x;*/
        
        for(int i=1;i<nums.length;i+=2){
            System.out.println(nums[i]);
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}