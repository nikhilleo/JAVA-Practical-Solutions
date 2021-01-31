// Write a java program to accept a number from the user, if number is zero then throw user
// defined Exception “Number is 0” otherwise calculate the sum of first and last digit of a given
// number (Use static keyword).

import java.lang.*;
import java.util.*;


class NumberException extends Exception{

}

public class Demo {
    void check(int n)throws NumberException
    {   
        if(n==0)
        {
            throw new NumberException();
        }
        else{
            System.out.println(n);
            int ans=0,rem,num=0;
            while(n>0)
            {
                rem = n%10;
                ans = ans + rem;
                while (n>0) {
                    rem = n%10;
                    num = num * 10 + rem; 
                    n = n/10;
                }
                ans = ans + num%10;
            }
            System.out.println("Addition Is:" + ans);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        n = sc.nextInt();
        Demo obj = new Demo();
        try {   
            obj.check(n);
        } catch (Exception e) {
            System.out.println("Number Cannot Be Zero");
        }   
    }
}