class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int r=numBottles,c=numBottles;
        while(r>numExchange){
            c+=r/numExchange;
            r=r/numExchange+r%numExchange;
            System.out.println(c+"           "+r);    
        }
        if(r==numExchange){
            c+=1;
            r=0;
        }
        System.out.println(c+"           "+r);
        return c;
    }
}