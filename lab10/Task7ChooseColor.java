import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task7ChooseColor extends Applet implements ActionListener {

    Button redBtn, greenBtn, blueBtn;
    Color currentColor = Color.BLACK;

    public void init() {
        redBtn = new Button("Red");
        greenBtn = new Button("Green");
        blueBtn = new Button("Blue");

        add(redBtn);
        add(greenBtn);
        add(blueBtn);

        redBtn.addActionListener(this);
        greenBtn.addActionListener(this);
        blueBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redBtn) currentColor = Color.RED;
        if (e.getSource() == greenBtn) currentColor = Color.GREEN;
        if (e.getSource() == blueBtn) currentColor = Color.BLUE;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(currentColor);
        g.fillOval(150, 100, 100, 100);
        g.drawString("Color Circle", 160, 90);
    }
}