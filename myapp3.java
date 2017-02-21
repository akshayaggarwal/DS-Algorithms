import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class myapp3
{
	TextField t1,t2,t3;
	Label l1;
	Button b1;
	Frame f;

	public myapp3()
	{
		f = new Frame("Flow Layout");
		//f.setLayout(new FlowLayout());
		t1=new TextField(50);
		t2=new TextField(50);
		t3=new TextField(50);
		l1=new Label("First Number");
		b1=new Button("Field Sum");
		//b1.addActionListener(this);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(l1);
		f.add(b1);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args)
	{
		new myapp3();
	}
/*
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int a,b,c;
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
			c=a+b;
			t3.setText(c+" ");
		}
	}
*/}
