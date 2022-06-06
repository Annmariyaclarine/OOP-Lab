package s2java;
import java.awt.*;

public class Example1 extends Frame {
Example1(){
	Button b=new Button("click me!");
	b.setBounds(30,100,80,30);
	add(b);

setSize(300,300);
setTitle("This is our basic awt example");
setLayout(null);
setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example1 f=new Example1();
	}

}
