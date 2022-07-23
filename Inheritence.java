import java.util.Scanner;

/*
 * types of inheritence 
 * 1.Single(*) 
 *     	A
 * 		|
 * 		B
 * 2.Multilevel
 * 		A
 * 		|
 * 		B
 * 		|
 * 		C
 * 3.Multiple(*)
 *      A    B
 * 		|    |
 *  	------
 *  	  |
 *  	  C
 *     
 * 4.hirearchy(*)
 * 		   A
 * 		   |
 * 		------
 * 		|	 |
 * 		B    C
 * 5.hybrid
 * */
class A
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A:");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A :"+a);
	}
}

class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B:");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B :"+b);
	}
}

class C extends A
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C:");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C :"+c);
	}
}

class D extends A
{
	int d;
	void getD()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter D:");
		d=sc.nextInt();
	}
	void putD()
	{
		System.out.println("D :"+d);
	}
	
}


public class Inheritence {

	public static void main(String[] args) {
		
		B b1=new B();
		C c1=new C();
		D d1=new D();
		
		b1.getA();
		b1.getB();
		c1.getC();
		d1.getD();
		b1.putA();
		b1.putB();
		c1.putC();
		d1.putD();
	}
}
