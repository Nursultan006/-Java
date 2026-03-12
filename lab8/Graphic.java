package MyGraph;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame{

Graphic(String s){
super(s);

setLayout(null);
setSize(200,300);
setVisible(true);

this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setResizable(false);

Button lin = new Button("y = kx");
lin.setBounds(40, 20, 120, 30);
add(lin);

Button x3 = new Button("x³ + x² + x");
x3.setBounds(40, 70, 120, 30);
add(x3);

Button x5 = new Button("x⁵");
x5.setBounds(40, 120, 120, 30);
add(x5);

Button sin = new Button("sin(x)");
sin.setBounds(40, 170, 120, 30);
add(sin);

Button cos = new Button("cos(x-1)+x");
cos.setBounds(40, 220, 120, 30);
add(cos);


lin.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event){
new Linear("y = kx");
}
});

x3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event){
new X3("x³ + x² + x");
}
});

x5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event){
new X5("x⁵");
}
});

sin.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event){
new SinX("sin(x)");
}
});

cos.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent event){
new CosX("cos(x-1)+x");
}
});

}

public static void main(String[] args){
new Graphic("Графики функций");
}
}