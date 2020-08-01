import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
	
	JFrame f;
	
	JTableExample(){
		
		f = new JFrame("JTable Example");
		
		String data[][] = {{"101","Amit","670000"},
				           {"102","Jai","780000"},
				           {"103","Sachin","65000"}};
		
		String column[]= {"Id","Name","Salary"};
		
		JTable jt = new JTable(data,column);
		jt.setBounds(30, 40, 200, 300);
		
		JScrollPane sp = new JScrollPane(jt);
		
		f.add(sp);
		f.setSize(300, 400);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTableExample();
	}

}
