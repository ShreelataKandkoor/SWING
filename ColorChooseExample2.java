import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ColorChooseExample2 implements ActionListener{
	
	JFrame f;
	JButton b;
	JTextArea ta;
	
	ColorChooseExample2(){
		
		f = new JFrame("Color Choose Example");
		b = new JButton("Pad Color");
		b.setBounds(200, 250, 100, 30);
		
		ta = new JTextArea();
		ta.setBounds(10, 10, 300, 200);
		
		b.addActionListener(this);
		
		f.add(b);
		f.add(ta);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400, 400);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		Color color = JColorChooser.showDialog(ta, "Select a color", Color.CYAN);
		ta.setBackground(color);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ColorChooseExample2();
		

	}

	

}
