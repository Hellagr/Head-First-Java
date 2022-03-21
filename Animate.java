import javax.swing.*;import java.awt.*;import java.lang.Object.*;import java.awt.GradientPaint;import java.awt.event.ActionEvent;
public class Animate {    public static void main (String[] args) {       Animate gui = new Animate();	   inAnimate inanima = new inAnimate();	   public void doStuff() {       inanima.go();	   }   class inAnimate {    public void go() {		JFrame frame = new JFrame();		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		frame.getContentPane().add(frame);		frame.setSize(600,600);		frame.setVisible(true);				JButton button = new JButton ("Click me");
		frame.getContentPane().add(BorderLayout.SOUTH, button);		frame.repaint();   }	public void actionPerformed(ActionEvent event) {	   frame.repaint();
			}		}	}}   class MyDrawP extends JPanel {       public void paintComponent(Graphics g  ) {         Graphics2D g2d = (Graphics2D) g;
	
	int red =(int) (Math .random() * 255);
	int green = (int) (Math.random() * 255);
	int blue = (int) (Math .random() * 255);
	
	Color startColor = new Color(red, green, blue);
	
	red = (int) (Math . random() * 255);
	green = (int) (Math.random() * 255);
	blue = (int) (Math.random() * 255);
	Color endColor = new Color (red, green, blue);
	}}
