package s2java;
import java.awt.*;


public class Example2 {
	Example2(){
		Frame f=new Frame();
		Label l=new Label("employee id");
		Button b=new Button("submit");
		TextField t=new TextField();
		l.setBounds(20,80,80,30);
		t.setBounds(20,100,80,30);
		b.setBounds(100,100,80,30);
		f.add(b);
		f.add(l);
		f.add(t);
		f.setSize(400,300);
		f.setTitle("employee info");
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example2 awt_obj=new Example2();
	}

}
