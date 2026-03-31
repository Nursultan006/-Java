import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task6NameInput extends Applet implements ActionListener {

    TextField tf;
    Button btn;
    String name = "";

    public void init() {
        tf = new TextField(20);
        btn = new Button("OK");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        name = tf.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Привет, " + name, 50, 100);
    }
}