
public class Buy_Sell_Stock {
    public static int buyAndSellStocks(int prices[]){
        int buyprice = Integer.MAX_VALUE; // negative Infinity
        int MaxProfit = 0;
        int n = prices.length;
        for(int i = 0; i < n; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;   //today profit
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else{
                buyprice = prices[i];
            }
        }

        return MaxProfit;
    }


    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max profit to buy and sell Stocks is " + buyAndSellStocks(prices));

    }
}
