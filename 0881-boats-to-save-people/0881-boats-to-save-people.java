class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int res=0,n=people.length;
        Arrays.sort(people);
        int sum=0;
        int l=0,h=n-1;
        while(l<=h){
            if(people[l]+people[h]<=limit){
                l++;
                h--;
            }
            else
                h--;
            res++;
        }
        return res;
    }
}