/*This problem was asked by Facebook.

Write a function that rotates a list by k elements. 

For example, [1, 2, 3, 4, 5, 6] rotated by two becomes [3, 4, 5, 6, 1, 2]. 

Try solving this without creating a copy of the list. 
How many swap or move operations do you need?

*****************************SOLVED************************************
*/
public class shiftArray {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6};
        shift(array, 2);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] shift(int[] array, int shiftNum){
        int curr = array[0];
        int prev = 0;
        for(int i = 1; i < array.length; i++){
            array[prev] = array[i];
            prev++;
        }

        array[array.length-1] = curr;
        shiftNum -= 1;
        if(shiftNum != 0){
            shift(array, shiftNum);
        }
    return array; 

    }
}