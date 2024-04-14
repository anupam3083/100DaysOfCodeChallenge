class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int r=numBottles,c=numBottles;
        while(r>numExchange){
            c+=r/numExchange;
            r=r/numExchange+r%numExchange;
        }
        if(r==numExchange){
            c+=1;
            r=0;
        }
        return c;
    }
}