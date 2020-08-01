import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderExample extends JFrame{
	
	public SliderExample() {
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
		JPanel panel = new JPanel();
		panel.add(slider);
		add(panel);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SliderExample frame = new SliderExample();
		frame.pack();
		frame.setVisible(true);

	}

}
