
// // Write a java program to display “Hello Java” with settings Font- Georgia, Foreground 
// // color- Red, background color – Blue on the Frame (Use Label)


// import java.lang.*;

// import jdk.internal.org.objectweb.asm.Label;

// import java.applet.Applet;
// import java.awt.*;

// public class Slip7 extends Applet
// {
//     public void paint(Graphics g)
//     {
//         Label l1 = new Label("Hello JAVA");
//         Font geor = new Font("Georgia",24);
//         g.setFont(bold);
//         g.setColor(Color.red);
//         l1.setBackground(Color.blue);
//         add(l)
//     }
// }

import java.lang.*;
import java.awt.*;
import java.applet.Applet;
public class Slip7 extends Frame
{
      Label l;
      Slip7()
      {
            l=new Label("Hello java");
            l.setFont(new Font("Georgia",Font.BOLD,14));
            l.setForeground(Color.RED);
            add(l);
            setBackground(Color.BLUE);
            setSize(300,300);
            setLayout(new FlowLayout());
              setVisible(true);
                  }
      public static void main(String a[])
      {
            new Slip7();
      }
}
