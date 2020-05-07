import java.io.*;
import java.util.*;

/*
********************************ACTUAL INTERVIEW QUESTION I GOT FROM LYFT***************************************

input: abccccdd (type: String) -> e.g. cac, dccbccd, etc....
output: 7


solution('abcccdd') == 7

Logic:
  - Even count of chars from the input string can be assumed as palindromes so they need to be added together to get initial palindrome
  - Then the largest odd number of chars needs to be added to the sum to keep the palindrome symetrical then return the new num (sum of evens + largest odd num)


*/


class longestPalindrome {
  public static void main(String[] args) {
    String input = "aaabbbbbccc";
    System.out.print(longestPalindrome(input));

    //TODO: Change from hardcode input to take in user input using a scanner
  }
  
  public static int longestPalindrome(String input){
    HashMap<Character, Integer> map = new HashMap<>();
    //even sums and return value
    int value = 0;  

    //check for largest odd num
    int largestOdd = 0;  

    //string to check that no character is repeated
    String checker = "";  

    //value to check if an odd value has been added to the value count
    boolean set = true;   

    //function to fill map with char count
    fillMap(map, input);  
    
    for(int i = 0; i < input.length(); i++){
      //checking and creating new string to find and skip duplicates
      if(checker.indexOf(input.charAt(i)) == -1){ 
        //indexer
        if(map.get(input.charAt(i)) % 2 == 0){  
          //sum even values
          value += map.get(input.charAt(i));  
          //concatenate to checker to avoid duplicates
          checker += input.charAt(i);   
        }
        else{
          //check for odd number and if whole odd has been added already
          if(map.get(input.charAt(i)) > 1 && set == true){  
            value += map.get(input.charAt(i));
            checker += input.charAt(i);
            //makes sure no other whole odd number is added to value count
            set = false;    
            continue;
          }
            //adds odd num - 1 to find longest palindrome
            value += map.get(input.charAt(i)) - 1;  
            //concatenate to checker to avoid duplicates
            checker += input.charAt(i);   
        }
      }
    }
    //returns the sum of all the even values, one odd and all other odds - 1
    return value;   

  }
    
  public static HashMap<Character, Integer> fillMap(HashMap<Character, Integer> map, String input){
    for(int i = 0; i < input.length(); i++){
      //if key is not in map then add it with a count of 1
        if(!map.containsKey(input.charAt(i))){  
          map.put(input.charAt(i), 1);
        }
        else{
          //if in map already add it to the existing count
          map.put(input.charAt(i), map.get(input.charAt(i)) + 1); 
        }
      }
      return map;
  }

      
}
      
  
