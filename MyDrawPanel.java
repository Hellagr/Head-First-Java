import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class MyDrawPanel extends JPanel {

	public static void main (String[] agrs){
		
		JFrame frame = new JFrame (); 
		JButton button = new JButton ("Click me");
		Container panel = frame.getContentPane();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.setSize(600,600);
		frame.setVisible(true);
		panel.setBackground(Color.black);

	}


public void paintRequest(){
                System.out.println("Request to paint received.");
                repaint();
        }
		
public void paintComponent(Graphics g) {
	
	Graphics2D g2d = (Graphics2D) g;
	
	int red =(int) (Math .random() * 255);
	int green = (int) (Math.random() * 255);
	int blue = (int) (Math .random() * 255);
	
	Color startColor = new Color(red, green, blue);
	
	red = (int) (Math . random() * 255);
	green = (int) (Math.random() * 255);
	blue = (int) (Math.random() * 255);
	Color endColor = new Color (red, green, blue);
	
	GradientPalnt gradient = new GradientPalnt(70,70,startColor, 150,150, endColor);
	q2d.setPaint(gradient);
	g2d.fillOval(70,70,100,100) ;
		
		
		}
	}

	
