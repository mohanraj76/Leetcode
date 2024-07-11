package Problems;

public class BestTimetoBuyandSellStock_121 {

    public static void main(String[] args) {


        int[] prices = {7,1,5,3,6,4};

        int buy_price = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buy_price){
                buy_price = prices[i];
            }else {

                int curr_profit = prices[i] - buy_price;
                profit = Math.max(profit,curr_profit);

            }

        }
        System.out.println(profit);
    }

}
