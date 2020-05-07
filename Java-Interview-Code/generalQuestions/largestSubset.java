import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;

public class largestSubset {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a set of ints: ");
        HashSet<Integer> set = new HashSet<>();
        set.add(input.nextInt());

        System.out.println(set);
    }
}