import java.util.*;
public class DemoLinkedHashset
{
	public static void main(String[] args)
	{
		// creating hashset using set
		Set<String> data= new LinkedHashSet<String>();
		data.add("Umesh");
		data.add("Shreya");
		data.add("Harshali");
		data.add("Nilma");
		System.out.println(data);
	}
}