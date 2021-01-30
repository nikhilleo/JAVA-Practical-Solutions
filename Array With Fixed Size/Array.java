

import java.lang.*;
import java.util.*;

public class Array {

    int arr[] = new int [6];

    void accept()
    {
        System.out.println("Enter Array Elements");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6 ; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("\nEntered Array Elements Are:");
        for(int i = 0 ; i < 6; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Array obj = new Array();
        obj.accept();
        obj.display();
    }
}