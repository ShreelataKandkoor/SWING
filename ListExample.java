import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class ListExample {
	
	ListExample(){
		
		JFrame f = new JFrame();
		
		DefaultListModel<String>l1 = new DefaultListModel<>();
		l1.addElement("Item");
		l1.addElement("Item2");
		l1.addElement("Item3");
		l1.addElement("Item4");
		l1.addElement("Item5");
		l1.addElement("Item6");
		
		JList<String>list = new JList<>(l1);
		list.setBounds(100, 100, 75, 75);
		f.add(list);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ListExample();

	}

}
