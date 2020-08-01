import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class JToggleButtonExample extends JFrame implements ItemListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JToggleButtonExample();
	}
	
	private JToggleButton button;
	
	JToggleButtonExample(){
		
		setTitle("JToggleButton with ItemListener Example");
		setLayout(new FlowLayout());
		setToggleButton();
		setAction();
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setAction() {
		// TODO Auto-generated method stub
		button.addItemListener(this);
		
	}

	private void setToggleButton() {
		// TODO Auto-generated method stub
		button = new JToggleButton("No");
		add(button);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(button.isSelected())
			button.setText("OFF");
		else
			button.setText("ON");
		
	}

}
