class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit=0;
        // int i=0;
        // for(int j=1; j<prices.length; j++){
        //     if(prices[j]<=prices[i]){
        //         i++;
                
        //     } else{
        //         int currentProfit = 0;
        //         currentProfit+=prices[j]-prices[i];
        //         i++;
        //         if(currentProfit>maxProfit){
        //             maxProfit=currentProfit; 
        //         }
                
        //     }
            
        // }
        // return maxProfit;
        int max = 0;
        int curr = 0;
        for(int i=1;i<prices.length;i++){
            curr += prices[i]-prices[i-1];
            max = Math.max(max,curr);
            if(curr<0)
                curr=0;
        }
        return max;
    }
}