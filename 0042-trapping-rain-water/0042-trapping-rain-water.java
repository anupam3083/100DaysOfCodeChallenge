class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            mx=height[i]>mx?height[i]:mx;
            left[i]=mx;
        }
        mx=0;
        for(int i=n-1;i>=0;i--){
            mx=height[i]>mx?height[i]:mx;
            right[i]=mx;
        }
        mx=0;
        for(int i=0;i<n;i++){
            mx+=Math.min(left[i],right[i])-height[i];
        }
        return mx;
    }
}