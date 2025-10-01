class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countfive = 0, countten = 0;
        for(int i = 0; i < bills.length; ++i){
            if(bills[i] == 5){
                countfive += 1;
            } else if(bills[i] == 10){
                if(countfive == 0) return false;
                countfive -= 1;
                countten += 1;
            } else {
                if(!(countfive > 2) && !(countfive > 0 && countten > 0)){
                     return false;
                }

                if(countfive > 0 && countten > 0){
                    countfive -= 1;
                    countten -= 1;
                } else{
                    countfive -= 3;
                }
            }
        }
        return true;
    }
}