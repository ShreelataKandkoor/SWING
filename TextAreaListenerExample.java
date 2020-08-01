import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TextAreaListenerExample implements ActionListener{

	JTextArea area;
	JLabel l1;
	JLabel l2;
TextAreaListenerExample(){
		
		JFrame f = new JFrame();
		 area = new JTextArea("Welcome to Java");
		area.setBounds(10, 30, 200, 200);
		
		JButton b = new JButton("Click here");
		b.setBounds(100, 300, 120, 30);
		b.addActionListener(this);
		
		l1 = new JLabel();
		l2 = new JLabel();
		
		l1.setBounds(50, 10, 100, 30);
		l2.setBounds(160, 10, 100, 30);
		
		f.add(l1);
		f.add(l2);
		f.add(b);
		f.add(area);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TextAreaListenerExample();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = area.getText();
		String words[] = text.split("\\s");
		l1.setText("Words:"+words.length);
		l2.setText("Characters:"+text.length());
		
		
		
	}

}
