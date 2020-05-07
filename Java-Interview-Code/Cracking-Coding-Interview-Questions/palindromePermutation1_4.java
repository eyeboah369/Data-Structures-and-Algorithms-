import java.util.*;
/*Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words. 

****************INCOMPLETE => (issue with initial spaces of input(line 18))********************* */
class palindromrPermutation1_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        System.out.println(palindromeCheck(userInput));
    }

    public static boolean palindromeCheck(String inputString){
        HashMap<Character, Integer> map = new HashMap<>();
        boolean oddChecker = true;
        int lengthChecker = 0;
        mapPopulator(inputString, map);
        System.out.println(map);
        for(int i = 0; i < inputString.length(); i++){
            if(map.get(inputString.charAt(i)) % 2 == 0){
                continue;
            }
            else {
                if(oddChecker == true){
                    oddChecker = false;
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;

    }

    public static HashMap<Character, Integer> mapPopulator(String inputString, HashMap<Character, Integer> map){
        Character charChecker = ' ';
        for(int i = 0; i < inputString.length(); i++){
            charChecker = inputString.charAt(i);
            if(charChecker == ' '){
                continue;
            }
            if(charChecker < 'a'){
                charChecker = Character.toLowerCase(charChecker);
            }
            
            if(!map.containsKey(charChecker)){
                map.put(charChecker, 1);
            }
            else{
                map.put(charChecker, map.get(charChecker) + 1);
            }
        }
        return map;
    }
}