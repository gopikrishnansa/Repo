package Others.Stock;

public class Stock {
    public static void main(String[] args) {
        int[] input = {1,4,6,3,2};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : input) {
            if(price < minPrice){
                minPrice = price;
            }
            int profit = price - minPrice;
            if(price > maxProfit){
                maxProfit = profit;

            }

        }
        System.out.println(maxProfit);

    }

}
