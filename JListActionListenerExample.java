import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListActionListenerExample {
	
	JListActionListenerExample(){
		
		JFrame f = new JFrame();
		
		final JLabel label = new JLabel();
		label.setSize(500, 100);
		
		JButton b = new JButton("show");
		b.setBounds(200, 150, 80, 30);
		
		final DefaultListModel<String>l1 = new DefaultListModel<>();
		l1.addElement("C");
		l1.addElement("Java");
		l1.addElement("Python");
		l1.addElement("C++");
		l1.addElement("PHP");
		l1.addElement("HTML");
		
	   final JList<String>list1 = new JList<>(l1);
	   list1.setBounds(100, 100, 75, 75);
	   
	   final DefaultListModel<String>l2 = new DefaultListModel<String>();
		l2.addElement("Sevlet");
		l2.addElement("applet");
		l2.addElement("Swing");
		l2.addElement("Jsp");
		l2.addElement("C#");
		l2.addElement("CSC");
		
	   final JList<String>list2 = new JList<>(l2);
	   list2.setBounds(100, 200, 75, 75);
	   f.add(list1);
	   f.add(list2);
	   f.add(b);
	   f.add(label);
	   f.setSize(400, 400);
	   f.setLayout(null);
	   f.setVisible(true);
	   
	   
	   b.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String data = "";
			
			if(list1.getSelectedIndex()!=-1) {
				
				data = "Programming language Selected:"+list1.getSelectedValues();
				label.setText(data);
			}
			
			
			if(list2.getSelectedIndex()!=-1) {
				
				data+=",Framework Selected:";
				
				for(Object frame: list2.getSelectedValues()) {
					
					data+=frame+"";
				}
			}
			
			label.setText(data);
			
		}
		   
		   
	   });
	   
	   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JListActionListenerExample();

	}

}
