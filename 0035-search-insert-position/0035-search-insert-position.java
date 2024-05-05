class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0]>=target){
            return 0;
        }
        if(nums[nums.length-1]==target){
                return nums.length-1;
            }
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        int l=0;
        int h=nums.length-1;
        int mid;
        while(l<=h){
            mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                if(mid<nums.length && nums[mid+1]>=target){
                    return mid+1;
                }
                l=mid+1;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
        }
        return nums.length;
    }
}