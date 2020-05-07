import java.util.*;
/*There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales. pale -> true
pale. bale -> true
pale. bake -> false 
*************************SOLVED********************************* */
class oneAway1_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String firstInput = input.nextLine();
        System.out.print("Input another string: ");
        String secondInput = input.nextLine();

        System.out.println(oneAwayChecker(firstInput, secondInput));
    }

    public static boolean oneAwayChecker(String first, String second){
        int counter = 0;
        String longer = "";
        String shorter = "";
        if(first.length() > second.length()){
            longer = first;
            shorter = second;
        }
        else{
            longer = second;
            shorter = first;
        }
        //System.out.print(longer + " " + shorter);
        for(int i = 0; i < longer.length(); i++){
            if(shorter.indexOf(longer.charAt(i)) == -1){
                counter += 1;
                if(counter > 1){
                    return false;
                }
            }
            else {
                continue;
            }
        }
        return true;
    }
}