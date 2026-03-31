import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Task3TextMove extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Hello Java Applet", 150, 150);
    }
}