package com.sarandis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketForServer {

	public static void main(String[] args) throws Exception
	{
		System.out.println("server is working....!");
		ServerSocket ss=new ServerSocket(8090);
		
		System.out.println("server is wating for client");
		Socket s=ss.accept();
		
		System.out.println("client connected!! everything works properly!");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();
		
		System.out.println("Client sends the following data: "+ str);	
	}
}
