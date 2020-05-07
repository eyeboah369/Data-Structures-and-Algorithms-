/* ******************************INCOMPLETE****************************************


his problem was asked by Google.

Given the head of a singly linked list, swap every two nodes and return its head.

For example, given 1 -> 2 -> 3 -> 4, return 2 -> 1 -> 4 -> 3.
*/
import java.util.*;

public class swapLinkList{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print(swapNums(list));
    }

    public static int swapNums(LinkedList<Integer> list){
        int temp = 0;
        int two = 2;
        for(int i = 1; i < list.size(); i++){
            int prev = i - 1;
            if(two == 2){
                temp = list.get(prev);
                //list.remove(prev);
                two--;
            }
            else if (two == 1){
                list.add(prev, list.get(i));
                list.add(i, temp);
                two--;
            }
            else{
                two += 2;
            }
            System.out.print("This is prev: " + list.get(prev) + " ");
            System.out.println("This is i: " + list.get(i) + " ");
        
        }
        
        int head = list.peek();
        return head;
    }
}