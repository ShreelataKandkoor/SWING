import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//JLabel example with ActionListener

public class LabelListenerExample extends Frame implements ActionListener{
	
	JTextField tf;
	JLabel l; 
	JButton b;
	
	LabelListenerExample(){
		
		tf = new JTextField();tf.setBounds(50, 50, 150, 20);
		
		l = new JLabel();
		l.setBounds(50, 200, 250, 20);
		
		b = new JButton("Click here");
		b.setBounds(50, 100, 250, 20);
		
		b.addActionListener((ActionListener) this);
		
		add(tf);
		add(l);
		add(b);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new LabelListenerExample();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
         
		String s = tf.getText();
		
		l.setText(""+s);
		
	}

}
