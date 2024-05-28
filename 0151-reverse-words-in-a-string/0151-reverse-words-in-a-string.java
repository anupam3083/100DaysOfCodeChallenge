class Solution {
    public String reverseWords(String s) {
        String s1[] = s.trim().split("\\s+");
        StringBuilder a1=new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
            a1.append(s1[i]);
            if(i!=0){
                a1.append(" ");
            }
        }
        return a1.toString();
    }
}