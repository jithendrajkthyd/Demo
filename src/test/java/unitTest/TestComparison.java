package unitTest;
import org.testng.annotations.Test;
import compare.Comparestrings;
public class TestComparison {

	@Test
	public void passtest()	
	{
	Comparestrings obj1=new Comparestrings();
	obj1.containsOrNot("Selenium is Test Automation");
	
}

	@Test
	public void failtest()	
	{
	Comparestrings obj1=new Comparestrings();
	obj1.containsOrNot("Jenkins is a CI tool");
	
}
}