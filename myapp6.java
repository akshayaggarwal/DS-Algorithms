/*import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;*/

import java.io.File;
//import java.awt.image.BufferredImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.applet.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class myapp5 extends Applet implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	TextField t1;
	//JFrame f;
	MenuItem view,add_statn,exit;	

	public void init()
	{	
		int i;
		//b=new JButton[11];
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		b11=new Button("Result");
		t1 = new TextField(50);
		//f = new JFrame("Welcome");
		//f.setSize(714,700);
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MenuBar mb=new MenuBar();
        	Menu m=new Menu("Admin");
        	view=new MenuItem("View complains");
		add_statn=new MenuItem("Add Station");
 		

		view.addActionListener(this);
		add_statn.addActionListener(this);
		

		m.add(view);
		m.add(add_statn);
		
		mb.add(m);
		//setMenuBar(mb);
		setLayout(null);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(t1);

		//for(i=0;i<11;i++)
		//	b[i].addActionListener(this);
		pack();  		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
	}
//	public static void main(String[] args)
//	{
//		myapp5 obj = new myapp5();
//	}
}
