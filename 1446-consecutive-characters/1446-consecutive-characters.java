class Solution {
    public int maxPower(String s) {
        
        int res=1;
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                res=res<c?c:res;
                c=1;
            }
        }
        res=res<c?c:res;
        return res;
    }
}