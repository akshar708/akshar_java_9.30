
interface ifs1
{
	static void meth1()
	{
		System.out.println("meth1");
	}
}
interface ifs2 extends ifs1
{
	void meth2();
}

public class Interface_demo implements ifs1 {
	
	public void meth2()
	{
		System.out.println("meth2");
	}

	public static void main(String[] args) {
		Interface_demo i=new Interface_demo();
		ifs1.meth1();
		i.meth2();
	}
}
