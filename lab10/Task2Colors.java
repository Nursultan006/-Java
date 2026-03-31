import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Task2Colors extends Applet {
    public void paint(Graphics g) {

        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 80);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.drawLine(50, 200, 250, 200);

        g.setColor(Color.ORANGE);
        g.fillRect(300, 150, 120, 70);

        g.setColor(Color.MAGENTA);
        g.drawOval(50, 250, 100, 80);
    }
}