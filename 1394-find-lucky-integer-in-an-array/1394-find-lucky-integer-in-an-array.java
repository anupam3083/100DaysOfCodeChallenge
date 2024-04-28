class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int c=-1;
        for(int i:arr){
            if(mp.containsKey(i))
                mp.put(i,mp.get(i)+1);
            else
                mp.put(i,1);
        }
        for(int i:mp.keySet()){
            if(i==mp.get(i))
                c=i>c?i:c;
        }
        return c;
        
    }
}