class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0)
            return 0;
        
        int[] results = new int[amount+1];
        results[0] = 0;

        for(int i = 1; i<=amount; i++) {
            int min = 0;

            for(int coin: coins) {
                if( ((i-coin) < 0) || (results[(i-coin)] == -1) )
                    continue;

                if(min == 0)
                    min = 1+results[(i-coin)];
                else 
                    min = Math.min(min, 1+results[(i-coin)]);
            }
            if(min == 0)
                results[i] = -1;
            else
                results[i] = min;
        }

        // int i = 0;
        // for(int r: results) {
        //     System.out.print(i+"="+r+"   ");
        //     i++;
        // }

        return results[amount];
    }
}