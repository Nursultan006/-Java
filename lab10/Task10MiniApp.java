import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Task10MiniApp extends Applet implements ActionListener {

    TextField tf;
    Button btn;
    String text = "";

    Color shapeColor = Color.RED;
    Random rand = new Random();

    public void init() {
        tf = new TextField(20);
        btn = new Button("Show");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = tf.getText();

        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        shapeColor = new Color(r, g, b);

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Text: " + text, 50, 100);

        g.setColor(shapeColor);
        g.fillRect(50, 120, 150, 100);
        g.setColor(Color.BLACK);
        g.drawString("Color Box", 80, 240);
    }
}