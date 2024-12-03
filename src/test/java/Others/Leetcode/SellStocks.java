package Others.Leetcode;

public class SellStocks {
    public static void main(String[] args){
        int[] prices = {3,10,5,2,6,1};
        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < lowestPrice){
                lowestPrice = prices[i];
                System.out.println("iteration: "+i+" Lowest price: " +lowestPrice);
            }
            int profit = prices[i]-lowestPrice;
            System.out.println("iteration: "+i+"  profit: " +profit);
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
        // find the lowest price - done
        // find the current profit by subtracting the lowest value with min value
        // find the highest profit
    }
}
