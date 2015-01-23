import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.Random;

public class groundhog extends Applet implements KeyListener{
	Color Brown= new Color(175,129,102);
	Color LBrown= new Color(198,148,119);
	Color LBlue= new Color(128,185,223);
	Color Ears= new Color(186, 138, 111);
	Color Out= new Color(102, 67, 46);
	Color Foot= new Color(216,164,112);
	int width = 800;
	int length = 800;
	int x1 = 615;
	int x2 = 740;
	int x3 = 775;
	int y1 = 635;
	int y2 = 595;
	int y3 = 675;
	
	
	public void init ()
	{
		addKeyListener(this);
	}

	public void paint(Graphics g){

		g.setColor(Color.green);

		setBackground(Color.green);


		g.setColor(Ears);
		g.fillOval(560, y2, 25, 35);
		g.fillOval(633, y2, 25, 35);
		g.setColor(Brown);
		g.fillRoundRect(560, y2, 100, 200, 100, 120);
		g.setColor(LBlue);
		g.fillRoundRect(580, x1, 14, 25, 30, 30);
		g.fillRoundRect(615, x1, 14, 25, 30, 30);
		g.setColor(LBrown);
		g.fillOval(570, y1, 70, 40);
		g.setColor(Ears);
		g.fillOval(560, x2, 45, 65);
		g.fillOval(610, x2, 45, 65);
		g.setColor(Foot);
		g.fillOval(560, x3, 35, 30);
		g.fillOval(612, x3, 35, 30);
		g.setColor(Ears);
		g.fillRoundRect(560, y3, 35, 60, 20, 45);
		g.fillRoundRect(615, y3, 35, 60, 20, 45);
		g.setColor(Color.black);
		g.fillOval(585, y1, 26, 18);
		g.setColor(Out);
		g.fillOval(450, 660, 330, 135);
		g.setColor(Color.black);
		g.fillOval(465, 670, 300, 105);
		g.setColor(Color.green);
		g.fillOval(510, 660, 220, 15);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_DOWN)
		{
			x1++;
			x2++;
			x3++;
			y1++;
			y2++;
			y3++;
		}
		else if (key == KeyEvent.VK_UP)
		{
			x1--;
			x2--;
			x3--;
			y1--;
			y2--;
			y3--;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
