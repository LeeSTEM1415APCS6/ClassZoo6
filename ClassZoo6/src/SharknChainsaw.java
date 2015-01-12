import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;
public class SharknChainsaw extends Applet implements KeyListener{
	public void paint(Graphics g){
		Random rand = new Random();
		g.setColor(Color.blue);
		g.fillRect(0, 0, 800, 800);
		fish.right(g, 100, 100, Color.red);
		fish.left(g, 300, 150, Color.green);
		int a = rand.nextInt(501);
		int b = rand.nextInt(501);
		int x = 10;
		int y = 10;
		int x2 = a - y;
		int y2 = b - x;
		int xgo ;
		int ygo ;
			do{
				
			fish.right(g, x, y, Color.red);
			Delay.delay(70);
			fish.right(g, x, y, Color.blue);
			y += 5;
			x += 2;
			}while (y <= 500);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
class fish{
	public static void right(Graphics g, int x, int y, Color c){
		Polygon tail = new Polygon();
		tail.addPoint(x, y);
		tail.addPoint(x, y + 38);
		tail.addPoint(x + 25, y + 19);
		if (c == Color.blue){
			g.setColor(Color.blue);
		}
		else{
			g.setColor(c);
		}
		g.fillPolygon(tail);
		g.fillOval(x + 25, y, 50, 38);
		if (c == Color.blue){
			g.setColor(Color.blue);
		}
		else if (c == Color.black){
			g.setColor(Color.white);
		}
		else{
			g.setColor(Color.black);
		}
		g.fillOval(x + 50, y + 6, 12, 12);
	}
	public static void left(Graphics g, int x, int y, Color c){
		Polygon tail = new Polygon();
		tail.addPoint(x + 50, y + 19);
		tail.addPoint(x + 75, y + 38);
		tail.addPoint(x + 75, y);
		if (c == Color.blue){
			g.setColor(Color.blue);
		}
		else{
			g.setColor(c);
		}
		g.fillPolygon(tail);
		g.fillOval(x, y, 50, 38);
		if (c == Color.blue){
			g.setColor(Color.blue);
		}
		else if (c == Color.black){
			g.setColor(Color.white);
		}
		else{
			g.setColor(Color.black);
		}
		g.fillOval(x + 12, y + 6, 12, 12);
	}
}
class Delay{
	public static void delay(int n){
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();	
	}
}