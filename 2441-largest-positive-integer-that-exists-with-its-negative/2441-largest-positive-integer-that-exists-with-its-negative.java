class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> mp=new HashSet<>();
        int res=-1;
        for(int i:nums){
                if(mp.contains(-1*i)){
                    res=i>res?i:res;
                    res=(-1*i)>res?(-1*i):res;
                }
                else{
                    mp.add(i);
                }
        }
        return res;
        
    }
}