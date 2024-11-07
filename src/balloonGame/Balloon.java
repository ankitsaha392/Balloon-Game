package balloonGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

public class Balloon extends Thread implements drawObject{
	
	int x, y, r, stringLength;
	Dimension dm;
	Balloon(){
		
		this.dm=Toolkit.getDefaultToolkit().getScreenSize();
		this.x=(int) ((int) (Math.random()*1000)+dm.width/2.5);
		this.y=(int) (Math.random()*1000);
		this.r=25;
		this.stringLength=20;
		
		start();
	}

	 public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(y>dm.height*0.99) 
				y=0;
			
			y+=Math.random()*15;
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

	}
	

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.drawLine(x+r/2, y+r, x+r/2, y+r + stringLength);
		g.setColor(Color.black);
		g.fillOval(x, y, r, r+5);
		g.setColor(Color.red);
		g.fillOval(x, y, r, r);
		
		
	}

}
