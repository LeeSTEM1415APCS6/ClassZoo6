import java.awt.*;
import java.applet.*;
import java.util.Random;
public class SharknChainsaw extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(0, 0, 800, 800);
	}
}
class fish{
	
}
class Delay{
	public void delay(int n){
		long startDelay = System.currentTimeMillis();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.currentTimeMillis();	
	}
}