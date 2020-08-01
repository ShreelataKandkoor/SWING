import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SeparatorExample {
	
	JMenu menu,submenu;
	JMenuItem l1,l2,l3,l4,l5;
	
	SeparatorExample(){
		
		JFrame f = new JFrame("SeparatorExample");
		JMenuBar mb = new JMenuBar();
		
		menu = new JMenu("Menu");
		l1 = new JMenuItem("Item 1");
		l2 = new JMenuItem("Item 2");
		
		menu.add(l1);
		menu.addSeparator();
		menu.add(l2);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SeparatorExample();

	}

}
