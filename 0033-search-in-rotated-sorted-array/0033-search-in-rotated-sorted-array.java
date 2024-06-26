class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        int mid,k=0;
        while(l<=h){
            k++;
            mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if( nums[l]<=nums[mid] ){ //first part is sorted 
                if(nums[l]<=target && target<nums[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{ //second part is sorted
                if(nums[mid]<target && target<=nums[h]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}