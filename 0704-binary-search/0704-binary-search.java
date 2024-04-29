class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1;
        int mid=0;
        int i=0;
        if(nums[l]==target){
            return 0;
        }
        while(h>=l){
            mid=l+(h-l)/2;
           // System.out.println(l+"  "+nums[l]+"   "+mid+"   "+nums[mid]+"  "+h+"  "+nums[h]);
            System.out.println(l+"     "+mid+"     "+h+"  ");
            if(nums[mid]==target){
                return mid;
            }
        
            else if(nums[mid]>target){
                h=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
        }
        return -1;
    }
}