
import java.lang.*;
import java.util.*;


abstract class Shape {
    abstract void area();
    abstract void volume();
}

public class Demo extends Shape{

    double ans,r,h;
    void area(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius And Height Of Cone To Find Area:");
        r = sc.nextInt();
        h = sc.nextInt();
        ans = 3.14 * r * ( r + Math.sqrt(h * h + r * r ));
        System.out.println("Area Of Cone : "+ans);

        
        System.out.println("Enter Radius And Height Of Cylinder To Find Area");
        r = sc.nextInt();
        h = sc.nextInt();
        ans = 2 * 3.14 * r * h + 2 * 3.14 * r * r;
        System.out.println("Area Of Cylinder" + ans);
    
    }
    
    void volume() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius And Height Of Cylinder To Find Volume");
        r = sc.nextInt();
        h = sc.nextInt();
        ans = 3.14 * r * r * h;
        System.out.println("Volume Of Cylinder" + ans);

        System.out.println("Enter Radius And Height Of Cone To Find Volume");
        r = sc.nextInt();
        h = sc.nextInt();
        ans = 3.14 * r * r * (h / 3);
        System.out.println("Volume Of Cone" + ans);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.area();
        obj.volume();
    }
}

