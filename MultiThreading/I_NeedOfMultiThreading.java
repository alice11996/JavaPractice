// Basics Of MultiThreading
class Employee
{

	String empname;
	int tracker;

	
	public Employee(String n)
	{
		empname = n;
	}
	
	public void DoATask()
	{
		for(tracker = 0; tracker <= 5; tracker = tracker + 1)
		{
			System.out.println("The employee "+empname+" prints "+tracker);
		
		}
	
	}
	
}
class I_NeedOfMultiThreading
{
	public static void main(String[] args)
	{
		Employee empone = new Employee("Mayank");
		Employee emptwo = new Employee("Alex");
		
		emptwo.DoATask();
	
		empone.DoATask();
	
	
	}


}


