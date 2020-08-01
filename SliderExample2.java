import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SliderExample2 extends JFrame{

	//Slider with painting stick
	
	SliderExample2(){
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
		slider.setMinorTickSpacing(2);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		JPanel panel = new JPanel();
		panel.add(slider);
		add(panel);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SliderExample2 frame = new SliderExample2();
		frame.pack();
		frame.setVisible(true);

	}

}
