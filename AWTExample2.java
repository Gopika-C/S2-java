package s2java;
import java.awt.*;
public class AWTExample2 {
	AWTExample2(){
		Frame f=new Frame();
		Label l=new Label("Employee id");
		TextField t=new TextField();
		Button b=new Button("Submit");
		l.setBounds(60,80,80,30);
		t.setBounds(20,100,80,30);
		b.setBounds(100,100,80,30);
		f.add(l);
		f.add(t);
		f.add(b);
		f.setSize(400,300);
		f.setTitle("Employee Info");
		f.setLayout(null);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		AWTExample2 awt2=new AWTExample2();

	}

}
