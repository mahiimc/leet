public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        // int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int latestLowPrice = Integer.MAX_VALUE;

        for(int i=0;i<prices.length-1;i++) {
            latestLowPrice = prices[i] < latestLowPrice ? prices[i] : latestLowPrice;
            maxProfit = Math.max(maxProfit, prices[i+1]-latestLowPrice); 
        }
        return maxProfit;
    }
}
