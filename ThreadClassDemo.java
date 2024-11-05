import java.io.*;
import java.lang.*;

public class ThreadClassDemo extends Thread
{
	public static void main(String args[])
	{
		Thread t1=new Thread("my thread");
		ThreadClassDemo t2 =new ThreadClassDemo();
		t1.start();
		t2.start();	
		String str=t1.getName();
		System.out.println("Name of Thread t1 is "+str);
	}
	public void run()
	{
		System.out.println("Thread is created & executed");
	}
}
