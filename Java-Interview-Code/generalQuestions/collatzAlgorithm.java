// package whatever; // don't place package name!

//************************ACTUAL INTERVIEW QUESTION FROM DIMAGI(SOLVED)************************************** */
//Algorithm that ends up at 1 no matter what value is input.
    // n -> n/2 (n is even)
    // n -> 3n + 1 (n is odd)
//given the collatz algorithm above and given an int input create a
//function that returns how many times the input has to be run through
// the algorithm to get to 1
// 1
// 2 > 1
// 3 > 10 > 5 > 16 > 8 > 4 > 2 > 1
// 4 > 2 > 1
// 5 > 16 > 8 > 4 > 2 > 1

// collatz(3) = 8
// collatz(4) = 3
// collatz(5) = 6

/*
What we know 
- / n -> n/2 (n is even)
    // n -> 3n + 1 (n is odd) for the collatz algorithm
  - kepp track of the output for the input of each number through the algo.
  - the amount elements that are in the chain for the input 
  - input can also be negative or very large 
  
Questions:
  - How to keep track of the amount of elements in chain?
  
Initial Approach:
- recursive approach where the input for the function would be a var as 
  as well as the given input to pass in 
  > the amount in the chain but also whats left of the input to get to 1
  Implementation:
  -Given the function and input: check wether the input is even or odd using conditional
    helps keep track of the following:
    // n -> n/2 (n is even) then increment result 
    // n -> 3n + 1 (n is odd) increment result 
    
    If the input is either even or odd then pass it through the mathematical operation
    Recursively call the function passed with the ccount for elelments in the chain as well
    as whats left of the input 
    var -> result
    
    ******Base case: if the input is already 1; or negative;


*/
import java.io.*;

class collatzAlgorithm {
	public static void main (String[] args) {
    //value to be returned from function
    int result = 0;
    int input = 4;
    int returnedValue = collatzChecker(result, input, " ");
    //results of rthe function call
    System.out.println(returnedValue);
    
	}
  
  //function to calculate the elements in the chain
  public static int collatzChecker(int result, int input, String prefix){
    prefix += " ";
    System.out.println(prefix + "Input to function: " + input);
    System.out.println(prefix + "result to function: " + result);
    //base case for input >>> if input is 1 then previous calls would be invalidated 
    //Can't we assume it will always come back to the base case?
    if(input == 1){
      System.out.println(prefix + "result to base case: " + result);
      result += 1;
      return result;
    }
    //check for odd input
    if(input % 2 == 1 && input != 1){
      input = 3 * input + 1;
      result += 1;
      //recursively call the function to continue checking # of elements
      return collatzChecker(result, input, prefix);
    }
    else {
      input = input / 2;
      result += 1;
      return collatzChecker(result, input, prefix);
    }
    //   System.out.println(prefix + "result from function: " + result);
    //   System.out.println(prefix + "ending input:" + input);
    // return result; 
  }
}
