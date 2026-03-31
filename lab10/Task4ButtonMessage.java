import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task4ButtonMessage extends Applet implements ActionListener {

    Button button;
    String message = "";

    public void init() {
        button = new Button("Click");
        add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        message = "Button pressed!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }
}