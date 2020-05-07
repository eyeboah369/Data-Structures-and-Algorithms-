import java.util.*;
/* Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? */
/*  ***************************SOLVED*********************************** */
class uniqueString1_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string for checking: ");
        String userInput = input.nextLine();

        System.out.println(checkUniqueString(userInput));

    }

    public static String checkUniqueString(String input){
        String checker = "";
        String positiveResult = "Your string is unique";
        String negativeResult = "Your string is not unique";

        if(input == null || input == ""){
            return positiveResult;
        }
        for(int i = 0; i < input.length(); i++){
            if(checker.indexOf(input.charAt(i)) == -1){
                checker += input.charAt(i);
            }
            else return negativeResult;
        }

        return positiveResult;
    }
}