package chapterno1;

public class DefaultConstructor {
	private int id;
	private String name;
	public DefaultConstructor() //Default constructor
	{
	id=0;
	name="";
	}
	public void display()
	{
	System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		DefaultConstructor s1=new DefaultConstructor();
		s1.display();

	}

}
