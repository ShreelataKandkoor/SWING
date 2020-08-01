import javax.swing.JButton;
import javax.swing.JFrame;

//Associtaion insider
public class Simple {
	
	JFrame f;
	
	Simple(){
		
		f = new JFrame();//instance ofJFrame
		
		JButton b = new JButton("click");//creating instance of JButton
		b.setBounds(130, 100, 100, 40);
		
		f.add(b);//adding button in JFrame
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Simple();

	}

}
