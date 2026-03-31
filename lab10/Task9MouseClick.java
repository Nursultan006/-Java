import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Task9MouseClick extends Applet implements MouseListener {

    int x = -1, y = -1;

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        if (x != -1 && y != -1) {
            g.setColor(Color.BLUE);
            g.fillOval(x - 10, y - 10, 20, 20);
        }
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}