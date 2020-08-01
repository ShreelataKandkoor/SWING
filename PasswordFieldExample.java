import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordFieldExample {
	
	PasswordFieldExample(){
		
		JFrame f = new JFrame("Password Field Example");
		JPasswordField value = new JPasswordField();
		JLabel l = new JLabel("Passowrd");
		
		l.setBounds(20, 100, 80, 30);
		value.setBounds(100, 100, 100, 30);
		f.add(value);
		f.add(l);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new PasswordFieldExample();

	}

}
