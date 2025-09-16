class BuyAndSell {
public static void main(String args []) {
int[] prices = {7,1,5,3,6,4};
 int profit = maxProfit(prices);
System.out.println("Maximum Profit: " + profit);

}

public static int maxProfit(int[] prices) {
 int minPrice = prices[0];
 int maxProfit = 0;
 for (int i = 1; i < prices.length; i++) {
 int profitToday = prices[i] - minPrice;
   if (profitToday > maxProfit) {
  maxProfit = profitToday;
 }

 if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}