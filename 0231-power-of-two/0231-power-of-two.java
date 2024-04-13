class Solution {
    public boolean isPowerOfTwo(int n) {

        while(n>1){
            if(n%2==1 && n>1){
                return false;
            }
            n/=2;
        }
        return n==1;
        
    }
}