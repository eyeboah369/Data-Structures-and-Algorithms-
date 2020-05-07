import java.util.*;
/*Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.) 
    **************************SOLVED*************************************** */
class spaceReplace1_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        System.out.println(spaceReplacer(userInput));
    }

    public static String spaceReplacer(String input){
        StringBuilder str = new StringBuilder();
        Character currentChar = null;
        if(input == null || input == ""){
            return str.toString();
        }
        for(int i = 0; i < input.length(); i++){
            currentChar = input.charAt(i);
            if(currentChar == ' '){
                str.append("%20");
            }
            else {
                str.append(input.charAt(i));
            }
        }
        return str.toString();
    }
}