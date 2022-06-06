package s2java;
import java.awt.*;
public class AWTExample extends Frame {
	AWTExample(){
		Button b=new Button("Click Me !!!!");
		b.setBounds(40,40,80,80);
		add(b);
		setSize(500,500);
		setTitle("This is our basic AWT Example");
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		AWTExample awt=new AWTExample();
	
	}

}
