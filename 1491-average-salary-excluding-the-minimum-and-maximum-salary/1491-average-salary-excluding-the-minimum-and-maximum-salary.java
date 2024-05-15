class Solution {
    public double average(int[] salary) {
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        int sum=0;
        for(int i:salary){
            if(i>mx)
                mx=i;
            if(i<mn){
                mn=i;
            }
            sum+=i;
        }
        return (double)(sum-(mx+mn))/(salary.length-2);
    }
}