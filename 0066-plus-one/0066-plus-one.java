class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        ArrayList<Integer> ls=new ArrayList<>();
        int r=0,carry=0,c=0;
        for(int i=n-1;i>=0;i--){
            if(c==0){
                r=digits[i]+1+carry;
                c=1;
            }                
            else
                r=digits[i]+carry;
            if(r>9){
                r=r%10;
                carry=1;
            }
            else
                carry=0;
            ls.add(0,r);
            r=0;
        }
        if(carry>0)
            ls.add(0,carry);
        int[] res=new int[ls.size()];
        c=0;
        for(int i:ls)
            res[c++]=i;
        return res;
    }
}