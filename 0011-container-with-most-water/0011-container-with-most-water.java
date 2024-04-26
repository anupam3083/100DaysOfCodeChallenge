class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int i=0;
        int j=height.length-1,n=height.length-1;
            while(i<j){
                int res=Math.min(height[i],height[j]);
                area=Math.max(area,res*(j-i));
                //System.out.println(area+"  "+height[i]+"  "+height[j]);
                if(height[i]==res){
                    i+=1;
                }
                else   
                    j-=1;
            }
        return area;
    }
}