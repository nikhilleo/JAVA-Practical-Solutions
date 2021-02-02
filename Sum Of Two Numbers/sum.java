
import java.lang.*;
import java.util.*;

public class sum {
    int a , b , c;
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        a = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        b = sc.nextInt();
    }
    void cal(){
        c = a + b; 
    }
    void display()
    {
        System.out.println("Addition :" + c);
    }
    public static void main(String args[]) {
        sum obj1 = new sum();
        obj1.accept();
        obj1.cal();
        obj1.display();
    }
}