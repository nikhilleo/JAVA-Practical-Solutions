

import java.awt.*;
import javax.swing.*;
public class Demo extends JFrame
{
      JLabel l1,l2,l3,l4,l5,l6;
      JTextField t1,t2,t3;
      JTextArea t;
      JPanel p,p1,p2,p3;
      ButtonGroup bg;
      JRadioButton m,f;
      JCheckBox c1,c2,c3;
      JButton b1,b2;
      Demo()
      {
            p =new JPanel();
            p1=new JPanel();
            l1=new JLabel("First Name ");
            l2=new JLabel("last Name ");
            l3=new JLabel("Address ");
            l4=new JLabel("mobile No ");
              t1=new JTextField(5);
            t2=new JTextField(10);
            t3=new JTextField(10);
            t=new JTextArea(2,10);
            p.add(l1);  
            p.add(t1);
            p.add(l2);  p.add(t2);
            p.add(l3);  p.add(t);
            p.add(l4);  p.add(t3);
            p.setLayout(new GridLayout(4,2));
            add(p);
                        l5=new JLabel("Gender ");
            m = new JRadioButton("Male");
            f = new JRadioButton("Female");
                        bg = new ButtonGroup();
            bg.add(m); 
            bg.add(f);
            p1.add(l5);
            p1.add(m);
            p1.add(f);
            p1.setLayout(new GridLayout(1,3));
                        p2=new JPanel();
            l6=new JLabel("Your Interests  ");
            c1=new JCheckBox("Computer");
            c2=new JCheckBox("Sports");
            c3=new JCheckBox("Music");
                        p2.add(l6);
            p2.add(c1);
            p2.add(c2);
            p2.add(c3);
            p2.setLayout(new GridLayout(1,4));
                        p3=new JPanel();
            b1=new JButton("submit");
            b2=new JButton("clear");
            p3.add(b1);
            p3.add(b2);
                        add(p);
            add(p1);
            add(p2);
            add(p3);
            setSize(300,400);
            setLayout(new FlowLayout(FlowLayout.LEFT)); 
                setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public static void main(String a[])
      {
            new Demo();
      }
}