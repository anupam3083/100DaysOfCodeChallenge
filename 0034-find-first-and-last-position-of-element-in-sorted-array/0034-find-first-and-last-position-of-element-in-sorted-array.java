class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int l=0,h=nums.length-1;
        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        int mid;
        while(h>=l){
            mid=l+(h-l)/2;
            //System.out.println(l+" "+mid+"  "+nums[mid]+" "+h);
            if(nums[mid]==target){
                int l1=mid,h1=mid;
                while(l1>=0 && nums[l1]==target){
                    l1--;
                }
                res[0]=l1+1;
                while(h1<nums.length && nums[h1]==target){
                    h1++;
                }
                res[1]=h1-1;
                return res;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
        
    }
}