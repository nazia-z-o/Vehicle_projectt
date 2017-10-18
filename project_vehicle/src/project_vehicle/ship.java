package project_vehicle;

public class ship extends water {
	ship()
	{}
	ship(int s)
	{
		System.out.print("ship ");
		speed(s);
		System.out.print("ship ");
		isRunning();
	}
	static void func3()
	{
		System.out.println("ship function");
	}
}
