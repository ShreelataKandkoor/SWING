import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("TextField Example");
		JTextField l1,l2;
		
		l1 = new JTextField("Hello World");
		l2 = new JTextField("Hello Java");
		
		l1.setBounds(50, 100, 200, 30);
		l2.setBounds(50, 150, 200, 30);
		
		f.add(l1);
		f.add(l2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		

	}

}
