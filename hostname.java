import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
import java.net.InetAddress;

public class hostname
{
	public static void main(String args[])
	{	
		try
		{
		//InetAddress inetAddress = InetAddress.getByName("192.18.97.39");
		//String str = InetAddress.getByName("192.18.97.39").getHostName();
		//InetAddress inetAddress = InetAddress.getHostName("localhost");
 		InetAddress addr = InetAddress.getByName("192.168.190.62");
  		String host = addr.getHostName();
  		System.out.println(host);	
		}
		catch (Exception e) 
		{
            //e.printStackTrace();
       		 }
	}
}
