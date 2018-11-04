//Coin Change Problem

public class CoinChange{

  //Num of Ways, the coin can be made using the given denominations
  public int change(int amount, int[] coins) {
    int[] dp = new int[amount + 1];
    dp[0] = 1;
    for (int coin : coins) {
        for (int i = coin; i <= amount; i++) {
            dp[i] += dp[i-coin];
        }
    }
    return dp[amount];
}

//Min Num of coin required to form the given amount using the unlimited supply of coins
public int coinChange(int[] coins, int amount) {
    int T[] = new int[amount + 1];
    //int R[] = new int[total + 1];
    T[0] = 0;
    for(int i=1; i <= amount; i++){
        T[i] = Integer.MAX_VALUE-1;
       // R[i] = -1;
    }
    for(int j=0; j < coins.length; j++){
        for(int i=1; i <= amount; i++){
            if(i >= coins[j]){
                if (T[i - coins[j]] + 1 < T[i]) {
                    T[i] = 1 + T[i - coins[j]];
                    //R[i] = j;
                }
            }
        }
    }
    //printCoinCombination(R, coins);
    return T[amount];
}

}
