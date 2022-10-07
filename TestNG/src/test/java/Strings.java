import org.testng.annotations.Test;

public class Strings
{

	@Test
	void m1()
	{
		String s1 =new String("tanmay");
		String s2 =new String("tanmay");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1=s2);
	}
	
	@Test
	void m2()
	{
		StringBuilder sb1 =new StringBuilder("tanmay");
		StringBuilder sb2 =new StringBuilder("tanmay");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1=sb2);
	}
}
