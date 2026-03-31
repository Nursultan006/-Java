import java.applet.Applet;
import java.awt.Graphics;

public class Task1Shapes extends Applet {
    public void paint(Graphics g) {

        g.drawRect(50, 50, 150, 100);
        g.drawString("Rectangle", 80, 45);

        g.drawOval(250, 50, 100, 100);
        g.drawString("Circle", 270, 45);

        g.drawLine(50, 200, 200, 200);
        g.drawString("Line", 100, 190);
    }
}