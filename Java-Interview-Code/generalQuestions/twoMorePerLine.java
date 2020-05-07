//**********SOLVED**************

import java.util.*;
public class twoMorePerLine {
    public static void main(String[] args){
        int a = 11;
        int b = 1;
        twoMore(a, b);
    }

    public static void twoMore(int m, int n){
        if(m == 0){
            System.out.println("0");
        };
        for(int i = 1; i <= n; i++){
                System.out.print(i + " ");
        }
        if(n < m){
                System.out.println();
                twoMore(m, n + 2);
        }
    }
}
