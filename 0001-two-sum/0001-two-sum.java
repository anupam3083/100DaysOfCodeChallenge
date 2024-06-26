class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
            }
            else{
                map.put(nums[i],i);
            }
        }
        
       // System.out.println("yes");
        return result;
    }
}