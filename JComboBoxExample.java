import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxExample {
	
	JFrame f;
	
	JComboBoxExample(){
		
		f = new JFrame("ComboBox Example");
		
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400, 100);
		
		JButton b = new JButton("Show");
		b.setBounds(200, 100, 75, 20);
		
		String languages[] = {"C","C++","Java","Python","Php"};
		
		final JComboBox cb = new JComboBox(languages);
		cb.setBounds(50, 100, 90, 20);
		
		f.add(cb);
		f.add(b);
		f.add(label);
		f.setSize(350, 350);
		f.setLayout(null);
		f.setVisible(true);
		
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String data = "Programming language Selected:"+cb.getItemAt(cb.getSelectedIndex());
				label.setText(data);
				
			}
			
			
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JComboBoxExample();

	}

}
