class Solution {
    public boolean isPalindrome(int x) {
        int res=0;
        int n=x;

        while(n>0){
            res=n%10+res*10;
            n/=10;

        }
        
        return x==res;
    }
}