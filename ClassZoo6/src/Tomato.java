import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;

public class Tomato extends Applet implements KeyListener {
	
	Color skyBlue = new Color(135,206,235);
	Color grassGreen = new Color(0,123,12);
	Color plantGreen = new Color(1,166,17);
	int width = 640;
	int height = 480;
	int tomX = 328;
	int tomY = height / 2;
	int sizeX = 20;
	int sizeY = 20;
	int time = 100;
	
	public void init ()
	{
		addKeyListener(this);
	}
	
	public void paint (Graphics g)
	{
		createEnvironment(g);
		createTomato(g);
	}
	
	public void createEnvironment (Graphics g)
	{
		g.setColor(skyBlue);
		g.fillRect(0, 0, width, 340);
		g.setColor(grassGreen);
		g.fillRect(0, 340, 640, 140);
		g.setColor(Color.yellow);
		g.fillOval(50, 50, 100, 100);
		
		g.setColor(plantGreen);
		g.drawLine(280, 200, 280, 360);
		g.drawArc(280, 230, 50, 20, 0, 180);

	}
	
	public void createTomato (Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(tomX-(3 * sizeX / 4),tomY+(sizeY/20),sizeX,sizeY);
		g.fillOval(tomX-(sizeX/2),tomY,sizeX,sizeY+(sizeY/10));
		g.fillOval(tomX-(sizeX/4),tomY+(sizeY/20),sizeX,sizeY);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_UP)
		{
			sizeY++;
		}
		else if (key == KeyEvent.VK_DOWN)
		{
			sizeY--;
		}
		else if (key == KeyEvent.VK_LEFT)
		{
			sizeX++;
		}
		else if (key == KeyEvent.VK_RIGHT)
		{
			sizeX--;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
