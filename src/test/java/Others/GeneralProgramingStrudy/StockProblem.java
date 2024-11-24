package Others.GeneralProgramingStrudy;

public class StockProblem {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        //System.out.println(minPrice);
        int maxProfit = 0;
        for(int price : prices){
            //System.out.println(price);
            if(price<minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }

        }
        System.out.println(maxProfit);


    }
}
