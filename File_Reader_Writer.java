import java.io.FileReader;
import java.io.FileWriter;

public class File_Reader_Writer {
	
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("tops2.txt");
		String s="This is File reader/writer demo using java";
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader("tops2.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char) i);
		}
		fr.close();
	}
}
