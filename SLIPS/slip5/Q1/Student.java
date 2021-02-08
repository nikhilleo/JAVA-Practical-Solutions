// Define a class Student with attributes rollno and name. Define default and parameterized
// constructor. Override the toString() method. Keep the count of Objects created. Create
// objects using parameterized constructor and Display the object count after each object is
// created.
import java.lang.*;
import java.util.*;

public class Student {
    
    int rollno;
    String name;
    static int cnt=0;
    Student()
    {
        System.out.println("In Default");
        cnt++;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number and Name");
        rollno = sc.nextInt();
        name = sc.next();
    }
    Student(int rollno , String name)
    {
       cnt++;
       this.rollno = rollno;
       this.name = name;
    }
    public void display()
    {
        System.out.println("Roll no :" + rollno + " Name :" + name);
    }
    public String toString()
    {
        return "Number Of Objects Created:" + cnt;
    }
    public static void main(String[] args) {
        Student obj = new Student();
        int no;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number and Name");
        no = sc.nextInt();
        name = sc.next();
        Student obj1 = new Student(no,name);
        System.out.println(obj);
        obj.display();
        obj1.display();
    }
}