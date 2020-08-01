import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class LayeredPaneExample extends JFrame{
	
	LayeredPaneExample(){
		
		super("LayeredPane Example");
		
		setSize(200,200);
		
		JLayeredPane pane = getLayeredPane();
		
		//creating buttons
		JButton top = new JButton();
		
		top.setBackground(Color.white);
		
		top.setBounds(20, 20, 50, 50);
		
		JButton middle = new JButton();
		
		middle.setBackground(Color.red);
		
		middle.setBounds(40, 40, 50, 50);
		
        JButton bottom = new JButton();
		
        bottom.setBackground(Color.cyan);
		
        bottom.setBounds(60, 60, 50, 50);
		
		//adding button on pane
		
		pane.add(bottom,new Integer(1));
		
		pane.add(middle,new Integer(1));
		
		pane.add(top,new Integer(1));
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LayeredPaneExample panel = new LayeredPaneExample();
		panel.setVisible(true);

	}

}
