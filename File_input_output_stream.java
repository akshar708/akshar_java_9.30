import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_input_output_stream {

	public static void main(String[] args) throws Exception{
		FileOutputStream fo=new FileOutputStream("tops1.txt");
		String s="this is file management using java";
		byte b[]=s.getBytes();
		fo.write(b);
		fo.flush();
		fo.close();
		
		FileInputStream fi=new FileInputStream("tops1.txt");
		int i;
		while((i=fi.read())!=-1)
		{
			System.out.print((char)i);
		}
		fi.close();
	}
}
