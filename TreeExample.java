import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
	
	JFrame f;
	
	TreeExample(){
		
		f = new JFrame();
		DefaultMutableTreeNode style = new DefaultMutableTreeNode("style");
		DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
		
		style.add(color);
		style.add(font);
		
		DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
		DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
		DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
		
		color.add(red);
		color.add(blue);
		color.add(black);
		color.add(green);
		
		JTree jt = new JTree(style);
		f.add(jt);
		f.setSize(300,300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TreeExample();

	}

}
