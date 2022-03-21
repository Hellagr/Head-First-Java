import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class SimpleGui3c implements ActionListener {

	JFrame frame;
	
	public static void main (String[] agrs) {
		SimpleGui3c gui = new SimpleGui3c();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Change colors");
		button.addActionListener(this);
		
		SimpleGui3c simplegui = new SimpleGui3c();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, simplegui);
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}
