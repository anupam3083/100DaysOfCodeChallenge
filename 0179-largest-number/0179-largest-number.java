class Solution {
    public String largestNumber(int[] nums) {
        
        int n=nums.length;
        String[] arr=new String[n];
        int k=0;
        for(int i:nums)
            arr[k++]=i+"";
        Arrays.sort(arr,(a1,a2)->(a2+a1).compareTo(a1+a2));
        StringBuffer sf=new StringBuffer();
        for(String i:arr)
            sf.append(i);
        return sf.charAt(0)=='0'?"0":sf.toString();
    }
}