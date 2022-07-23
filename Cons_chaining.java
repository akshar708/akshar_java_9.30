class A1
{
	A1()
	{
		System.out.println("A1 is default constructor");
	}
	void show()
	{
		System.out.println("Show from A1");
	}
}

class B1 extends A1
{
	B1()
	{
		System.out.println("B1 is default construtor");
	}
	void show()
	{
		System.out.println("Show from B1");
	}
}
class C1 extends B1
{
	C1()
	{
		System.out.println("C1 is default constructor");
	}
	void show()
	{
		System.out.println("Show from C1");
	}
}

public class Cons_chaining {
	public static void main(String[] args) {
		
		/*A1 a=new A1();
		B1 b=new B1();
		a.show();
		b.show();*/
		C1 c=new C1();
		c.show();
	}

}
