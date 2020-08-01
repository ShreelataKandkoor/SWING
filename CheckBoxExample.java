import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame("CheckBox Example");
		
		JCheckBox checkbox1 = new JCheckBox("C++");
		checkbox1.setBounds(100, 100, 50, 50);
		
		JCheckBox checkbox2 = new JCheckBox("Java",true);
		checkbox2.setBounds(100, 150, 50, 50);
		
		f.add(checkbox1);
		f.add(checkbox2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
