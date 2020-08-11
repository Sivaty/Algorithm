
//322. 零钱兑换
//https://leetcode-cn.com/problems/coin-change/

public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {2};
        int amount = 3;

        System.out.println(new CoinChange().coinChange1(coins, amount));
    }

//    递推
    public int coinChange1(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int[] coinNumber = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin: coins) {
                if (i >= coin) {
                    int tempMin = coinNumber[i - coin];
                    if (tempMin < 0) { continue; }
                    min = Math.min(min, tempMin);
                }
            }
            if (min == Integer.MAX_VALUE) {
                coinNumber[i] = -1;
            } else {
                coinNumber[i] = min + 1;
            }
        }
        return coinNumber[amount];
    }


//    记忆搜索
    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return -1;

        int[] coinNumber = new int[amount + 1];
        for (int coin: coins) {
            if (amount < coin) break;
            coinNumber[coin] = 1;
        }

        int result = coinChange(coins, coinNumber, amount);
        if (result == Integer.MAX_VALUE + 1) result = -1;

        return result;
    }

    public int coinChange(int[] coins, int[] coinNumber, int amount) {
        if (amount < 1) return Integer.MAX_VALUE;
        if (coinNumber[amount] == 0) {
            int min = Integer.MAX_VALUE;
            for (int coin: coins) {
                int tempMin = coinChange(coins, coinNumber, amount - coin);
                min = Math.min(min, tempMin);
            }
            coinNumber[amount] = min + 1;
        }

        return coinNumber[amount];
    }
}
