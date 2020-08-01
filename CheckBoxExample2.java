import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckBoxExample2 extends JFrame implements ActionListener{
	
	JLabel l;
	JCheckBox cb1,cb2,cb3;
	JButton b;
	
	CheckBoxExample2(){
		
		l = new JLabel("Food Ordering System");
		l.setBounds(50, 50, 300, 20);
		
		cb1 = new JCheckBox("Pizza @ 100");
		cb1.setBounds(100, 100, 150, 20);
		
		cb2 = new JCheckBox("Burger @ 30");
		cb2.setBounds(100, 150, 150, 30);
		
		cb3 = new JCheckBox("Tea @ 10");
		cb3.setBounds(100, 200, 150, 30);
		
		b = new JButton("Order");
		b.setBounds(100, 250, 80, 30);
		b.addActionListener(this); 
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(l);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CheckBoxExample2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		float amount =0;
		String msg="";
		
		if(cb1.isSelected()) {
			
			amount+=100;
			msg="Pizza:100\n";
		}
		
        if(cb2.isSelected()) {
			
			amount+=30;
			msg="Burger:30\n";
		}
        
        if(cb3.isSelected()) {
			
			amount+=10;
			msg="Tea:10\n";
		}
        
        msg+="-------\n";
        
        JOptionPane.showMessageDialog(this, msg+"Total:"+amount);
		
	}

}
