package com.sarandis;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketForClient {
	
	public static void main (String[] args) throws Exception
	{
		String ip="localhost";
		int port=8090;
					
		Socket s= new Socket(ip,port);
		
		String str="Sarandis, it works!";
		OutputStreamWriter osw=new OutputStreamWriter(s.getOutputStream());
		PrintWriter out= new PrintWriter(osw);
		osw.write(str);
		osw.flush();
	}
}
