

import java.lang.*;
import java.util.*;

public class Fact {

    int n , ans = 1, num;

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Find Factorial:");
        n = sc.nextInt();
        num = n;
    }   
    void cal()
    {
        while(n>0)
        {
            ans = ans * n;
            n = n - 1;
        }
    }
    void display()
    {
        System.out.println("Factorial Of " + num + " is " + ans);
    }
    public static void main (String args[]) {
        Fact obj = new Fact();
        Fact obj1 = new Fact();
        obj.accept();
        obj.cal();
        obj.display();
        System.out.println(obj);
        System.out.println(obj1);
        
    }
}