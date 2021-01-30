
import java.lang.*;
import java.util.*;

interface Shape {
    final double pi = 3.14;
    abstract void area();
}

public class Slip implements Shape {
    int r , h; 
    double ans;
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius To Find Area Of Circle:");
        r = sc.nextInt();
        ans = pi * r * r;
        System.out.println(ans);
  
        System.out.println("Enter Radius To Find Area Of Sphere:");
        r = sc.nextInt();
        ans = 4 * pi * r * r;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Slip obj = new Slip();
        obj.area();       
    }
}