package balloonGame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Testballoon extends JFrame implements ActionListener,KeyListener{
	
	drawObjectPanel dop;
	Balloon b;
	Arrows a;
	ArrowLauncher al;
	Dimension dm;
	int height;
	
	public Testballoon() {
		dop=new drawObjectPanel();
		add(dop);
		dm=Toolkit.getDefaultToolkit().getScreenSize();
		height=dm.height/2;
		

		al=new ArrowLauncher(dop, height);
		dop.displayBuffer.add(al);
		
		for(int i=0; i<30; i++) {
			b=new Balloon();
			
			dop.displayBuffer.add(b);
		}
		
		
		addKeyListener(this);
		Timer tr = new Timer(100, this);
		tr.start();
		
	}
	
	
	public static void main(String[] args) {
		Testballoon tb=new Testballoon();
		tb.setVisible(true);
		tb.setExtendedState(MAXIMIZED_BOTH);
		tb.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dop.repaint();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key=e.getKeyCode();
		if(key==39) {
			a=new Arrows(dop, height);
			
			dop.displayBuffer.add(a);
			
		}else if(key==38) {
			height-=10;
			al.y0-=10;
		}else if(key==40){
			height+=10;
			al.y0-=10;
		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
