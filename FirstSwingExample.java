import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstSwingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();//creating instance of JFrame.
		
		JButton b = new JButton("Click");//creating instance of JButton
		b.setBounds(130, 100, 100, 40);
		
		f.add(b);
		
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
