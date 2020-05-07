/*  This problem was asked by Facebook.

Given a number in Roman numeral format, convert it to decimal.

The values of Roman numerals are as follows:

{
    'M': 1000,
    'D': 500,
    'C': 100,
    'L': 50,
    'X': 10,
    'V': 5,
    'I': 1
}
In addition, note that the Roman numeral system uses subtractive notation for numbers such as IV and XL.

For the input XIV, for instance, you should return 14.

*******************INCOMPLETE: ISSUE WITH NULL POINTER EXCEPTION**********************

*/
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class romanDecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a roman # String: ");
        String romanNum = input.nextLine();

        System.out.println("Converted to decimal: " + decimalConverter(romanNum));
    }

    public static int decimalConverter(String romanNum){
        //map to store the char int pairing for the roman #
        HashMap<Character, Integer> map = new HashMap<>();
        //int to store result of conversion
        int result = 0;

        //helper function to populate map with roman values
        mapPopulate(map);
        for(int i = 1; i < romanNum.length()-1; i++){
            //counter to track comparison of adjacent chars in user input
            //int prev = i-1;

            //check to see if the char before i is less in the mapping
            try{
            if(map.get(romanNum.charAt(i)) > map.get(romanNum.charAt(i-1))){
                System.out.println("result is now: " + result);
                result += (map.get(romanNum.charAt(i) - map.get(romanNum.charAt(i-1))));
                
            }
            else {
                result += map.get(romanNum.charAt(i-1));
            }
            }
            catch(NullPointerException e){
                    System.out.println("Error is: " + e);
                }
        }

        return result;

    }

    //helper function to populate a map with roman values
    public static Map<Character, Integer> mapPopulate(Map<Character, Integer> map){
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('1', 1);

        return map;
    }
}