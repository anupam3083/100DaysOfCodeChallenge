class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] temp=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            
            if(nums1[i]<nums2[j]){
                temp[k++]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                temp[k++]=nums2[j];
                j++;
            }
            else{
                temp[k++]=nums1[i];
                temp[k++]=nums2[j];
                i++;
                j++;
            }
        }
        
        while(i<n){
            temp[k++]=nums1[i++];
        }
        while(j<m){
            temp[k++]=nums2[j++];
        }
        double s=0;
        if((n+m)%2==0){
            int a=(n+m)/2;
            System.out.print(temp[a-1]+"   "+temp[a]);
            s=(double)(temp[a]+temp[a-1])/2;
        }
        else{
            s=temp[(n+m)/2];
        }
        return s;
    }
}