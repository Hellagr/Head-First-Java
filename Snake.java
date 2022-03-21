import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;


public class Snake extends JPanel{
        private Vector xCoords = new Vector();
        private Vector yCoords = new Vector();



        public Snake(){
                xCoords.add(150);
                yCoords.add(150);
        }



        public void startJFrame(){
                JFrame window = new JFrame();
				window.add(new Snake());
                window.setSize(300, 300);
                window.setVisible(true);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Container c = window.getContentPane();
                c.setBackground(Color.black);
        }



        public void paintRequest(){
                System.out.println("Request to paint received.");
                repaint();
        }



        public void paintComponent(Graphics g){
                super.paintComponent(g);
                System.out.println("paintComponent was called");
                g.setColor(Color.blue);
                int x = (int)xCoords.get(0);
                int y = (int)yCoords.get(0);
                g.fillRect(x, y, 10, 10);
        }



        public static void main(String[] args){
                Snake mkFrame = new Snake();
                mkFrame.startJFrame();
                mkFrame.paintRequest();
        }
}