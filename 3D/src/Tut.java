import java.awt.Toolkit;
import javax.swing.JFrame;

public class Tut extends JFrame{
	
	static JFrame F = new Tut();
	Screen ScreenObject = new Screen();
	
	public Tut() {
		add(ScreenObject);
		setUndecorated(true);
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
	}

}
