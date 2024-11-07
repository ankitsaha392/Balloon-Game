package balloonGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

public class ArrowLauncher extends Thread implements drawObject{
	int x0, y0,height, width, yaxis;
	
	public Color color;
	drawObjectPanel dop;
	Dimension dm;

	public ArrowLauncher(drawObjectPanel dop, int yaxis) {
		// TODO Auto-generated constructor stub
		this.dop=dop;
		this.yaxis=yaxis;
		x0=0;
		y0=yaxis;
		dm=Toolkit.getDefaultToolkit().getScreenSize();
		//this.length=length;
		this.width=20;
		this.height=50;
		this.color = new Color(139, 69, 19);
		
	}
	
	



	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(new Color(139, 69, 19));

        g.fillArc(10, 10, width-20, height-20, 90, -180);
        g.fillRect(width/2-5, 10, 10, height-20);
        g.fillArc(width-20, 10, 10, height-20, 90, 180);

        g.setColor(Color.black);
        g.drawLine(width/2, 10, width/2, height-10);
		
	}
}
