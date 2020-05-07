/*  ************************INCOMPLETE(ISSUE WITH RECURSION)****************************

This problem was asked by Google.

Find the minimum number of coins required to make n cents.

You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.

For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢.*/



public class minCents{
    public static void main(String[] args){
        int[] coins = {25, 10, 5, 1};
        int amount = 24;
        int count = 0;
        System.out.println(findMin(coins, amount, count));
    }

    public static int findMin(int[] arr, int amount, int count){
        if(amount == 0){
            return 0;
        }
        for(int i = 0; i < arr.length; i++){
            if(amount >= arr[i]){
                System.out.println("amount was: " + amount);
                amount -= arr[i];
                System.out.println("amount is now: " + amount);
                count++;
                System.out.println("count is: " + count);
                if(amount == 0){
                    finalnum += count;
                    break;
                }
                else{
                    findMin(arr, amount, count);
                }
            }
        }
        return count;
    }
}