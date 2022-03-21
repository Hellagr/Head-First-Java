import javax.swing.*;
import java.awt.*;

class InnerButton {
	int x = 1;
	int y = 1;
	
	public static void main (String [] args) {
		InnerButton gui = new InnerButton();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,270);
		frame.setVisible(true);
		
		MyDrawP drawP = new MyDrawP();
		frame.getContentPane().add(drawP);
		
		
		for (int i=0; i<124; i++, y++, x++) {
			x++;
			y++;
			drawP.repaint();
		
		try {
			Thread.sleep(50);
		} catch (Exception ex) {}
		}
	}
	class MyDrawP extends JPanel {
		public void paintComponent (Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0,0,500,250);
			g.setColor(Color.blue);
			g.fillRect(x,y,500-x*2,250-y*2);

			
		}
	}
}
