
public class TestPerson 
{
	public static void main(String[] args) 
	{
	// create object of person
	Person person = new Person();
		
	// store the name of person using setter
	person.setName("Cute wale hasan");
	
	// fetch name of person
	String pn = person.getName();
	System.out.println("name of person is "+pn);
	
	}
}
