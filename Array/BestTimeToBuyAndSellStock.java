package Array;

public class BestTimeToBuyAndSellStock {
        public int maxProfit(int[] prices) {
            int currMax=0;
            int max=0;
            int minBuy=Integer.MAX_VALUE;
            for(int i=0;i<prices.length;i++){
                if(minBuy>prices[i]){
                    minBuy=prices[i];
                }
                currMax=prices[i]-minBuy;
                if(currMax>max){
                    max=currMax;
                }
    
            }
            return max;
            
        }
    }

