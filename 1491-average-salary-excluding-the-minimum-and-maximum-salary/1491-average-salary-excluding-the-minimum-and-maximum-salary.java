class Solution {
    public double average(int[] salary) {
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i:salary){
            if(i>mx)
                mx=i;
            if(i<mn){
                mn=i;
            }
        }
        int sum=0;
        for(int i:salary){
            if(i!=mn && i!=mx){
                sum+=i;
                System.out.println(i);
            }
                
        }
        return (double)sum/(salary.length-2);
    }
}