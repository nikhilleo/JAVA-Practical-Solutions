
import java.applet.Applet;
import java.awt.*;

public class Hello extends Applet {
    public void paint(Graphics g)
    {
        Font a = new Font("Serif",Font.BOLD,24);
        g.setFont(a);
        g.setColor(Color.red);
        g.drawString("Hello World",20,50);
    }
}