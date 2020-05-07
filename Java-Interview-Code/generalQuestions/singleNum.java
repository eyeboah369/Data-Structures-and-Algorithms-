/*This problem was asked by Facebook.

Given an array of integers in which two elements appear exactly once and all 
other elements appear exactly twice, find the two elements that appear only once.

For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. 
The order does not matter.


*****************************SOLVED************************************

*/
import java.util.*;
public class singleNum{

    public static void main(String[] args){
        int[] array = {2, 4, 6, 8, 10, 2, 6, 10} ;
        findSingle(array);
    }

    public static void findSingle(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        if(array.length == 0){
            System.out.print("Array is empty");
        }
        for(int i = 0; i < array.length; i++){
            if(map.get(array[i]) == null){
                map.put(array[i], 1);
            }
            else{
                int count = map.get(array[i]);
                map.put(array[i], count + 1);
            }
        }

        for(int i = 0; i < array.length; i++){
            if(map.get(array[i]) == 1){
                System.out.print(array[i] + " ");
            }
            else{
                continue;
            }
        }
    }
}