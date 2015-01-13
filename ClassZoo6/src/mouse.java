import java.awt.*;
	import java.applet.*;
	import java.util.*; 
																	

	public class mouse extends Applet
	{
		
		public void paint(Graphics g) 	
		{
			// Draw Grid
			
			
			Random rnd = new Random(1234);
			
			
			// Draw Random Lines
			g.setColor (Color.orange);
			int[] x = new int[]{30,180,105};
			int[] y = new int[]{30,30,180};
			g.fillPolygon(x, y, x.length);
			g.setColor(Color.white);
			g.fillOval(70, 60, 15, 10);
			g.fillOval(120, 60, 15, 10);
			g.setColor(Color.black);
			g.fillOval(77, 63, 5, 5);
			g.fillOval(126, 63, 5, 5);
			g.drawLine(90, 120,60, 104);
			g.drawLine(90, 120,60, 114);
			g.drawLine(90, 120,60, 124);
			g.drawLine(90, 120,60, 134);
			g.drawLine(90, 120,60, 144);
			g.drawLine(90, 120,60, 154);
			g.drawLine(120, 120,150, 104);
			g.drawLine(120, 120,150, 114);
			g.drawLine(120, 120,150, 124);
			g.drawLine(120, 120,150, 134);
			g.drawLine(120, 120,150, 144);
			g.drawLine(120, 120,150, 154);
			g.setColor(Color.pink);
			g.fillOval(100, 100, 10, 10);
			g.setColor(Color.white);
			g.fillOval(101, 102, 2, 2);
			g.fillOval(105, 102, 2 , 2);
			g.fillOval(105, 102, 2 ,2);
			g.setColor(Color.pink);
			g.fillOval(95, 140, 20, 10);
			g.fillOval(60, 20, 25, 15);
			g.fillOval(120, 20, 25, 15);
					
			




			
			// Draw 3-D Box
		
		
		
		
		
		}
			
	}



	    
	 
