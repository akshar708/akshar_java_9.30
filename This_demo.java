
class student
{
	int rno;
	String sname;
	public student()
	{
		System.out.println("Default constructor called");
	}
	public student(int rno, String sname)
	{
		this();  //Uper default constructor print kravu hoy to j this(); lakhvanu
		this.rno=rno;
		this.sname=sname;
		System.out.println("Roll number :" +this.rno);
		System.out.println("Student Name :" +this.sname);
	}
	
}

public class This_demo {

	public static void main(String[] args) {
		student s1=new student(1,"Akshar");
	}
}
