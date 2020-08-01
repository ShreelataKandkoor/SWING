import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample {
	
	JFrame f;
	JMenu menu, submenu;
	JMenuItem l1,l2,l3,l4,l5;
	
	MenuExample(){
		
		f = new JFrame("Menu Example");
		
		JMenuBar mb = new JMenuBar();
		menu = new JMenu("Menu");
		submenu = new JMenu("Submenu");
		
		l1 = new JMenuItem("Item 1");
		l2 = new JMenuItem("Item 1");
		l3 = new JMenuItem("Item 1");
		l4 = new JMenuItem("Item 1");
		l5 = new JMenuItem("Item 1");
		
		menu.add(l1);
		menu.add(l2);
		menu.add(l3);
		menu.add(l4);
		menu.add(l5);
		
		submenu.add(l1);
		submenu.add(l2);
		submenu.add(l3);
		
		menu.add(submenu);
		mb.add(menu);
		
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MenuExample();

	}

}
