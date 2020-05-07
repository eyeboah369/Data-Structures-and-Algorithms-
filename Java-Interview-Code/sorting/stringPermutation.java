import java.util.*;

class stringPermutation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string: "):
        String inputOne = input.nextLine();
        System.out.println("Input a second string: ");
        String inputTwo = input.nextLine();

        System.out.println(checkPermutation(inputOne, inputTwo);
    }

    public static boolean checkPermutation(String one, String two){
        for(int i = 0; i < two.length(); i++){
            if(one.indexOf(two,charAt(i)) == -1){
                return false
            }
        }
        return true;
    }
}