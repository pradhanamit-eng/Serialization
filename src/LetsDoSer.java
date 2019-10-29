import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class LetsDoSer 
{
	public static void main(String[] args) 
	{
		try 
		{
		// #1: open a file in write mode
		FileOutputStream fo = new FileOutputStream
				("d:/ASGMRTK/object_data.ser",false);
			
		// #2: create object of OOS and link in with FOS
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		
		// #3: create object that need to be saved
		Person p = new Person();
		
		// store data inside person
		p.setName("Hasan");
		p.setAge(17);
		p.setCity("New Delhi");

		// #4: save object 
		oo.writeObject(p);
		
		// #5: close stream
		oo.close();
		
		System.out.println("OK...DONE");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
