package project_vehicle;

public class car extends land {
	car()
	{}
	car(int s)
	{
		System.out.print("car ");
		speed(s);
		System.out.print("car ");
		isRunning();
	}
	static void func()
	{
		System.out.println("car function");
	}
}
