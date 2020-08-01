import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaExample {
	
	TextAreaExample(){
		
		JFrame f = new JFrame();
		JTextArea area = new JTextArea("Welcome to Java");
		area.setBounds(10, 30, 200, 200);
		f.add(area);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TextAreaExample();

	}

}
