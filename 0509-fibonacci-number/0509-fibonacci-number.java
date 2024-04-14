class Solution {
    public int fib(int n) {
        if(n<=1){
            return n; 
        }
        int a=0,b=1,c=0;
        while(n>1){
            c=a+b;
            a=b;
            b=c;
            n-=1;
        }
        return c;
    }
}