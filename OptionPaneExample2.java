import javax.swing.JFrame;
import javax.swing.JOptionPane;

//showMessageDialog()
public class OptionPaneExample2 {
	
	JFrame f;
	
	OptionPaneExample2(){
		
		f = new JFrame();
		JOptionPane.showMessageDialog(f, "Successfully Updated","Alert", JOptionPane.WARNING_MESSAGE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new OptionPaneExample2();

	}

}
