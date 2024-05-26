class Solution {
    public int lengthOfLastWord(String s) {
        String s1[]=s.split(" ");
        int res=0;
        for(String s2:s1)
            res=s2.length();
        return res;
    }
}