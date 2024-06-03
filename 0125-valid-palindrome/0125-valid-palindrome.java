class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z')|| (s.charAt(i)>='A' && s.charAt(i)<='Z')
            || (s.charAt(i)>='0' && s.charAt(i)<='9')
            ){
                sb.append(s.charAt(i));
            }
        }
        String s1=sb.toString().toLowerCase();
        int i=0,j=s1.length()-1;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)){
                System.out.println(s1+" "+s1.charAt(i)+" "+s1.charAt(j));
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}