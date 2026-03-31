import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task5Counter extends Applet implements ActionListener {

    Button button;
    int count = 0;

    public void init() {
        button = new Button("Press");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Count: " + count, 50, 100);
    }
}