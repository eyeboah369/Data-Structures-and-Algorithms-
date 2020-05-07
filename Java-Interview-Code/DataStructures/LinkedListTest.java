import java.util.LinkedList;
import java.lang.System.*;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        boolean check = list.contains(6);

        if(check){
            System.out.print("List contains element\n");
        }
        else {
            System.out.print("Number is not in list");
        }
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println("This is the index of 6: " + list.indexOf(6));
        list.set(2, 50);
        System.out.println("Updated list with new element: " + list);

    }
}