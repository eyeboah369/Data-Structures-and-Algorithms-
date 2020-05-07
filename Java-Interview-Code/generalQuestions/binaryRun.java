/*This problem was asked by Stripe.

Given an integer n, return the length of the longest consecutive run of 1s in its binary representation.

For example, given 156, you should return 3.

***************************SOLVED********************************
*/

import java.util.*;

public class  binaryRun {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Longest run on 1s: " + countOfLongestRun(num));
    }

    public static int countOfLongestRun(int num){
        String numStr = Integer.toBinaryString(num);
        //int binaryNum = Integer.parseInt(numStr);

        //three separate counts to keep track of longest 1s run
        int maxLength = 0;
        int currMax = 0;
        int newMax = 0;
        for(int i = 0; i < numStr.length(); i++){
            if(numStr.charAt(i) == '1'){
                currMax = Math.max(newMax, maxLength += 1);
            }
            else{
                newMax = currMax;
                maxLength = 0;
            }
        }
        //in the event that binary contains no '0' then return current max
        //or else 0 will be returned because else statement never reached to store new max
        if(numStr.indexOf('0') == -1){
                return currMax;
            }

        return newMax;
    }
}