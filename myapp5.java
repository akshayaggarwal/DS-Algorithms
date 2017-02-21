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
//import java.applet.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class myapp5
{
	JButton b1;
	TextField t1;
	JFrame f;
	MenuItem view,add_statn,exit;	

	public void myapp5()
	{	
		f = new JFrame();		
		int i;
		//b=new JButton[11];
		b1=new JButton("One");
		//b2=new JButton("2");
		b1.setBounds(130,100,100, 40);
		
		t1 = new TextField();
		
		/*MenuBar mb=new MenuBar();
        	Menu m=new Menu("Admin");
        	view=new MenuItem("View complains");
		add_statn=new MenuItem("Add Station");
 		

		//view.addActionListener(this);
		//add_statn.addActionListener(this);
		

		m.add(view);
		m.add(add_statn);
		
		mb.add(m);
		f.setMenuBar(mb);
		f.setLayout(null);*/
		f.add(b1);
		f.add(t1);

		f.setSize(400,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);
		/*f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);*/


		//for(i=0;i<11;i++)
		//	b[i].addActionListener(this);
		//f.pack();  		
		//f.setVisible(true);
		
	}
	
	//public void actionPerformed(ActionEvent ae)
	//{
	//	}
	public static void main(String[] args)
	{
		myapp5 obj = new myapp5();
	}
}
