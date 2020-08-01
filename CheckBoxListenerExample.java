import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
//checkbox with ItemListener

public class CheckBoxListenerExample {
	
	CheckBoxListenerExample(){
		
		JFrame f = new JFrame();
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		
		JCheckBox checkbox1 = new JCheckBox("C++");
		checkbox1.setBounds(100, 100, 50, 50);
		
		JCheckBox checkbox2 = new JCheckBox("Java",true);
		checkbox2.setBounds(100, 150, 50, 50);
		
		f.add(label);
		f.add(checkbox1);
		f.add(checkbox2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		checkbox1.addItemListener((ItemListener) new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				
				label.setText("C++ Checkbox:"+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
		
		
checkbox2.addItemListener((ItemListener) new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				
				label.setText("Java Checkbox:"+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CheckBoxListenerExample();

	}

}
