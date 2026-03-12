package MyGraph;

import java.awt.*;
import javax.swing.*;

public class X5 extends JFrame{

public X5(String s){
super(s);
setSize(600,400);
setVisible(true);
}

public void paint(Graphics g){

g.setColor(Color.lightGray);

for(int i=0;i<600;i+=20)
g.drawLine(i,0,i,400);

for(int i=0;i<400;i+=20)
g.drawLine(0,i,600,i);

g.setColor(Color.black);
g.drawLine(300,0,300,400);
g.drawLine(0,200,600,200);

int px=0;
int py=200;

for(double x=-2;x<2;x+=0.01){

double y=Math.pow(x,5);

int sx=(int)(300+x*100);
int sy=(int)(200-y*50);

g.drawLine(px,py,sx,sy);

px=sx;
py=sy;

}

}

}