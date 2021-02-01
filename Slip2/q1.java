// Write a java program to accept n names of cites from user and display them in descending
// order.

import java.lang.*;
import java.util.*;

public class q1 { 
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Cities To Enter:");
        n = sc.nextInt();
        String str[] = new String[n];
        System.out.println("Enter Cities:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if(str[i].compareTo(str[j]) < 0)
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Cities In Ascending Order Are:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}
