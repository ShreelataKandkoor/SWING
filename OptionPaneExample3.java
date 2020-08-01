import javax.swing.JFrame;
import javax.swing.JOptionPane;

//ShowInputDialog
public class OptionPaneExample3 {
	
	JFrame f;
	
	OptionPaneExample3(){
		
		f = new JFrame();
			
			String name = JOptionPane.showInputDialog(f,"Enter Name");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new OptionPaneExample3();
	}

}
