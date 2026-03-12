package MyGraph;

import java.awt.*;
import javax.swing.*;

public class CosX extends JFrame{

public CosX(String s){
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

for(double x=-10;x<10;x+=0.05){

double y=Math.cos(x-1)+x;

int sx=(int)(300+x*20);
int sy=(int)(200-y*20);

g.drawLine(px,py,sx,sy);

px=sx;
py=sy;

}

}

}