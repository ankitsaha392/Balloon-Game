package balloonGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Arrows extends Thread implements drawObject{
	int x0, y0, yaxis, length=20;
	Dimension dm;
	drawObjectPanel dop;
	
	
	public Arrows(drawObjectPanel dop, int yaxis) {
		// TODO Auto-generated constructor stubthis.dop=DrawArea;
		this.dop=dop;
		this.yaxis=yaxis;
		x0=0;
		y0=yaxis;
		dm=Toolkit.getDefaultToolkit().getScreenSize();
		//this.length=length;
		
		
		
		start();
	}

	public void run() {
		while(true) {
			x0+=7;
			for(drawObject b: dop.displayBuffer) {
				if(b instanceof Balloon) {
					if(Math.abs(((Balloon)b).x-x0)<15 && Math.abs(((Balloon)b).y-y0)<15) {
						((Balloon)b).y=0;
						dop.count++;
					}
				}
			}
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
        g.setColor(Color.red);
        g.drawLine(x0, y0, x0 + length, y0);
        g.drawLine(x0 + length, y0, x0 + length - 10, y0 - 5);
        g.drawLine(x0 + length, y0, x0 + length - 10, y0 + 5);
        g.drawLine(x0 + length, y0, x0 + length - 10, y0 - 5);
        g.drawLine(x0 + length, y0, x0 + length - 10, y0 + 5);
		
	}
	

}
