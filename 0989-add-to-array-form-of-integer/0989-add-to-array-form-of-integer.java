class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
     
        int sum=0,carry=0;
        List<Integer> ls=new ArrayList<>();
        
        for(int i=num.length-1;i>=0;i--){
            sum=num[i]+k%10+carry;
            k/=10;
            
            ls.add(0,sum%10);
            
            carry=sum/10;
            sum=0;
        }
        
        while(k>0){
            sum=k%10+carry;
            k/=10;
            
            ls.add(0,sum%10);
            
            carry=sum/10;
            sum=0;
        }
        if(carry>0){
            ls.add(0,carry);
        }
        return ls;
        
    }
}