import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class myapp4 extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Label l1;
	Button b1;
	public void init()
	{
		t1=new TextField(50);
		t2=new TextField(50);
		t3=new TextField(50);
		l1=new Label("First Number");
		b1=new Button("Field Sum");
		b1.addActionListener(this);
		add(t1);
		add(t2);
		add(t3);
		add(l1);
		add(b1);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String bip = "s1.mp3";
			Media hit = new Media(bip);
			MediaPlayer mediaPlayer = new MediaPlayer(hit);
			mediaPlayer.play();
		}
	}
}
