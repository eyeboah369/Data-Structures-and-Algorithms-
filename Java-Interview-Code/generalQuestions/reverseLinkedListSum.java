/*This problem was asked by Microsoft.

Let's represent an integer in a linked list format by having each node represent a digit in the number. The nodes make up the number in reversed order.

For example, the following linked list:

1 -> 2 -> 3 -> 4 -> 5
is the number 54321.

Given two linked lists in this format, return their sum in the same linked list format.

For example, given

9 -> 9
5 -> 2
return 124 (99 + 25) as:

4 -> 2 -> 1
*/

import java.util.LinkedList;

public class reverseLinkedListSum{
    public static void main(String[] args){

        LinkedList<Integer> first = new LinkedList<Integer>();
        first.add(9);
        first.add(9);
        LinkedList<Integer> second = new LinkedList<Integer>();
        second.add(5);
        second.add(2);

        //System.out.print(reverseSum(first, second));
    }

    public static int reverseSum(LinkedList one, LinkedList two) {
        Object[] oneArray = one.toArray();
        Object[] twoArray = two.toArray();
        String oneNum = "";
        String twoNum = "";
        String concat = "";
        int result = 0;
        for(int i = oneArray.length; i > 0; i--){
            oneNum += Integer.toString(oneArray[i]);
        }
        System.out.print(oneNum);
        for(int i = twoArray.length; i > 0; i--){
            twoNum += Integer.toString(twoArray[i]);
        }
        System.out.print(twoNum);
    return result;
    }
}