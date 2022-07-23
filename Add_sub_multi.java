import java.util.Scanner;

public class Add_sub_multi {
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter A:");
	    a=sc.nextInt();
	    System.out.println("Enter B:");
	    b=sc.nextInt();
	    c=a+b;
	    System.out.println("Addition:"+c);
	    c=a-b;
	    System.out.println("substraction:"+c);
	    c=a/b;
	    System.out.println("Divide:"+c);
	    c=a*b;
	    System.out.println("Multiplication:"+c);
	    sc.close();
	}

}
