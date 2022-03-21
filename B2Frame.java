import java.awt.Color;
import java.awt.Frame;

public class B2Frame extends Frame {

    public static void main(String[] args) {
        new Frame() {{
            setBackground(Color.YELLOW);
            setSize(400,340);
            setVisible(true);
        }};
    }

}