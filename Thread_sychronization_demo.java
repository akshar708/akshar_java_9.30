
class Callback
{
	public void call(String msg)
	{
		System.out.print("[" +msg);
		try
		{
			Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("]" );
	}
}

class Caller implements Runnable
{
	String s;
	Thread t;
	Callback c;
	public Caller(String msg,Callback c)
	{
		this.s=msg;
		this.c=c;
		t=new Thread(this);
		t.start();
	}
	public void run(){
		synchronized (c) {
			c.call(this.s);
		}
	}
}

public class Thread_sychronization_demo {

	public static void main(String[] args) {
		Callback c=new Callback();
		Caller c1=new Caller("Hello",c);
		Caller c2=new Caller("World",c);
	}
}
