class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(mid<=h){
            if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[h];
                nums[h]=temp;
                h--;
            }
            else if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[l];
                nums[l]=temp;
                l+=1;
                mid+=1;
            }
            else{
                mid++;
            }
        }
    }
}