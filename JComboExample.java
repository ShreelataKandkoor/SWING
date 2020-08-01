import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboExample {
	
	JFrame f;
	
	JComboExample(){
		
		f = new JFrame();
		String Country[] = {"India","USA","Russia","Italy","Paris","England"};
		
		JComboBox cb = new JComboBox(Country);
		cb.setBounds(50, 50, 100, 50);
		f.add(cb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JComboExample();

	}

}
