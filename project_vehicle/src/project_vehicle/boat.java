package project_vehicle;

public class boat extends water {
	boat()
	{}
	boat(int s)
	{
		System.out.print("boat ");
		speed(s);
		System.out.print("boat ");
		isRunning();
	}
	static void func4()
	{
		System.out.println("boat function");
	}
}
