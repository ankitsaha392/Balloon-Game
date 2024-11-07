package balloonGame;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JPanel;

public class drawObjectPanel extends JPanel{
	
	ArrayList<drawObject> displayBuffer=new ArrayList<drawObject>();
	ArrayList<drawObject> arrayBuffer=new ArrayList<drawObject>();
	
	int count=0;
	Dimension dm=Toolkit.getDefaultToolkit().getScreenSize();
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for(drawObject ob: displayBuffer) {
			ob.draw(g);
		}
		for(drawObject ob: arrayBuffer) {
			ob.draw(g);
		}
		g.drawString("Your Score is:"+ count, 100, 100);
	}
	

}
