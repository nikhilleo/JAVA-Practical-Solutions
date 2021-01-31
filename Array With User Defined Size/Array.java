

import java.lang.*;
import java.util.*;

public class Array {
    // int n;
    // int arr[] = new int [n];
    // void accept()
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter Size Of Array");
    //     n = sc.nextInt();
    //     int arr[] = new int [n];
    //     System.out.println("Enter Array Elements");
    //     for(int i = 0; i < n ; i++)
    //     {
    //         arr[i] = sc.nextInt();
    //     }
    //     // System.out.println("\nEntered Array Elements Are:");
    //     // for(int i = 0 ; i < n; i++)
    //     // {
    //     //     System.out.println(arr[i]);
    //     // }
    // }
    // void display()
    // {
    //     System.out.println("\nEntered Array Elements Are:");
    //     for(int i = 0 ; i < n; i++)
    //     {
    //         System.out.println(arr[i]);
    //     }
    // }
    // Array obj = new Array();
    // obj.accept();
    // obj.display();
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Size Of Array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter Array Elements");
        for(int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEntered Array Elements Are:");
        for(int i = 0 ; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}