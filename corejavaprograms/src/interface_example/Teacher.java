package interface_example;

public class Teacher implements Coder  {
	@Override
	public void codingWorks()
	{
		System.out.println("Must wakeup at "+wakeuptime);
		System.out.println("Checking with the students github");
	}

}
