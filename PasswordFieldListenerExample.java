import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordFieldListenerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("Password Field Example");
		
		final JLabel label = new JLabel();
		label.setBounds(20, 150, 200, 50);
		
		final JPasswordField value = new JPasswordField();
		value.setBounds(100, 75, 100, 30);
		
		JLabel l1 = new JLabel("Username");
		l1.setBounds(20, 20, 80, 30);
		
		JLabel l2 = new JLabel("Username");
		l2.setBounds(20, 75, 80, 30);
		
		JButton b = new JButton("Login");
		b.setBounds(100, 120, 80, 30);
		
		final JTextField text = new JTextField();
		text.setBounds(100, 20, 100, 30);
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String data = "Username"+text.getText();
				data+=",Password:"+new String(value.getPassword());
				label.setText(data);
				
			}
			
			
		});
		
		f.add(value);
		f.add(text);
		f.add(b);
		f.add(l2);
		f.add(l1);
		f.add(label);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
