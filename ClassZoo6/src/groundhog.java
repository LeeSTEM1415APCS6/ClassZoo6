import java.awt.*;
import java.applet.*;
import java.util.*;

@SuppressWarnings("serial")
public class groundhog extends Applet{

	public void paint(Graphics g){
		Color Brown= new Color(175,129,102);
		Color LBrown= new Color(198,148,119);
		Color LBlue= new Color(128,185,223);
		Color Ears= new Color (186, 138, 111);
		Color Out= new Color (102, 67, 46);
	
		
		
		setBackground(Color.green);
		g.setColor(Out);
		g.fillOval(450, 660, 330, 135);
		g.setColor(Color.black);
		g.fillOval(465, 670, 300, 105);
		g.setColor(Color.blue);
		g.fillOval(520, 600, 220,15);
		g.setColor(Ears);
		g.fillOval(500, 200, 25, 35);
		g.fillOval(573, 200, 25, 35);
		g.setColor(Brown);
		g.fillRoundRect(500, 200, 100, 200, 100, 120);
		g.setColor(LBlue);
		g.fillRoundRect(520, 220, 14, 25, 30, 30);
		g.fillRoundRect(555, 220, 14, 25, 30, 30);
		g.setColor(LBrown);
		g.fillOval(510, 240, 70, 40);
		g.setColor(Color.black);
		g.fillOval(525, 240, 26, 18);
		
	
		
	}
}
