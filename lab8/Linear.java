package MyGraph;

import java.awt.*;
import javax.swing.*;

public class Linear extends JFrame{

public Linear(String s){
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

for(double k=0.1;k<=1;k+=0.1){

int prevx=0;
int prevy=200;

for(int x=-300;x<300;x++){

double y=k*x;

int sx=300+x;
int sy=200-(int)y;

g.drawLine(prevx,prevy,sx,sy);

prevx=sx;
prevy=sy;

}

}

}

}