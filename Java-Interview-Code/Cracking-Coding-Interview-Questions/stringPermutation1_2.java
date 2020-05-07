import java.util.*;
/*Given two strings, write a method to decide if one is a permutation of the
other. */
/*  ************************SOLVED******************************** */
class stringPermutation1_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputOne = input.nextLine();
        System.out.print("Input a second string: ");
        String inputTwo = input.nextLine();

        System.out.println(checkPermutation(inputOne, inputTwo));
    }

    public static boolean checkPermutation(String one, String two){
        for(int i = 0; i < two.length(); i++){
            if(one.indexOf(two.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}