import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

//Displaying image of Button
public class ButtonExample {
	
	ButtonExample(){
		
		JFrame f = new JFrame("Button Example");
		
		JButton b = new JButton(new ImageIcon("E:\\logo.jpg"));
		
		b.setBounds(100, 100, 100, 40);
		
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ButtonExample();

	}

}
