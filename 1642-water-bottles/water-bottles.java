class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int ans= numBottles+ (numBottles-1)/(numExchange-1);
        // if(numBottles<=numExchange){
        //     ans--;
        // }
        // else if(numBottles==numExchange){
        //     ans-=2;
        // }
        return ans;
        
    }
}