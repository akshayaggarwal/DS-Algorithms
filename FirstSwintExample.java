import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
//import javax.swing.*;
import java.applet.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

import javax.swing.*;  
public class FirstSwintExample extends JComponent implements ActionListener{  


public void actionPerformed(ActionEvent ae)
{
	System.out.println("Hello");
}

public static void main(String[] args) {  

MenuItem view,add_statn,exit; 
MenuBar mb=new MenuBar();
Menu m=new Menu("Admin");
view=new MenuItem("View complains");
add_statn=new MenuItem("Add Station");
m.add(view);
m.add(add_statn);
		

JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b=new JButton("click");//creating instance of JButton  

b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
f.add(b);//adding button in JFrame  
mb.add(m);
f.setMenuBar(mb);
          
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  
}  
}



/*

*/
