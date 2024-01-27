package com.saurabh.arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int buy_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            if(buy_price<prices[i]){
                int profit=prices[i]-buy_price;
                max_profit=Math.max(max_profit,profit);
            }
            else{
                buy_price=prices[i];
            }
        }
        System.out.println(max_profit);
    }
}
