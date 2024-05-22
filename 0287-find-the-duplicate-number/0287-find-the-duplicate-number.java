class Solution {
    public int findDuplicate(int[] nums) {
        int dup=-1;
        for(int i=0;i<nums.length;i++){
            int cur=Math.abs(nums[i]);
            if(nums[cur]<0){
                return cur;
            }
            else{
                nums[cur]*=-1;
            }
        }
        return -1;
    }
}