import java.util.*;
import java.io.*;

public class Demo {
    public static void main(String args[]) throws Exception {
        int n, sal = 0;
        String name = "";
        Scanner sc = new Scanner(System.in);
        Hashtable h = new Hashtable<String, Integer>();
        System.out.println("\nEnter number of  Employee : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter name and Salary : ");
            name = sc.next();
            sal = sc.nextInt();
            h.put(name, sal);
        }
        Enumeration v = h.elements(); // sal
        Enumeration k = h.keys(); // name
        while (k.hasMoreElements()) {
            System.out.println(k.nextElement() + "   " + v.nextElement());
        }
        int max = 0;
        String str = "";
        k = h.keys();
        v = h.elements();
        while (v.hasMoreElements()) {
            // System.out.println(v.nextElements());
            sal = (Integer) v.nextElement();
            name = (String) k.nextElement();
            if (sal > max) {
                max = sal;
                str = name;
            }
        }
        System.out.println(str + " has maximum salary is " + max);
    }
}
