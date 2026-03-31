import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Task8Animation extends Applet implements Runnable {

    int x = 0;
    int y = 100;
    int dx = 5;

    Thread t;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x = x + dx;

            if (x > 300 || x < 0) {
                dx = -dx;
            }

            repaint();

            try {
                Thread.sleep(50);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50);
    }
}