package s2java;
import java.awt.*;
import java.awt.event.*;
public class AEvent extends Frame{
	TextField t1;
	AEvent(){
		t1=new TextField();
		t1.setBounds(60,50,170,20);
		Button b=new Button("Click Me !!!");
		b.setBounds(100,120,80,30);
		add(b);
		add(t1);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("Welcome");
			}
			
			
		});
		
	}
	

	public static void main(String[] args) {
		new AEvent();

	}

}
