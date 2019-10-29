import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LetsDoDeser 
{
	public static void main(String[] args) 
	{
		try 
		{
			// #1. open a file in read mode
			FileInputStream fi = new FileInputStream
					("d:/ASGMRTK/object_data.ser");
			
			// #2. create object of OIS and link it with FIS
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			// #3. fetch object using readObject() method of OIS
			Person per = (Person) oi.readObject();
		
			// #4.
			// fetch data of person using getters
			System.out.println(per.getName());
			System.out.println(per.getAge());
			System.out.println(per.getCity());
			
			// #5. close the stream
			oi.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
