import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MyJComponent extends JComponent{
	
	public void paint(Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillRect(30, 30,100, 100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyJComponent com = new MyJComponent();
		
		//create a basic JFrame
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame frame = new JFrame("JComponent Example");
		
		frame.setSize(300, 300);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add the JCompent to main frame
		frame.add(com);
		
		frame.setVisible(true);
		

	}

}
