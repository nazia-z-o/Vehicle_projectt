package project_vehicle;

public class bus extends land {
	bus()
	{}
	bus(int s)
	{
		System.out.print("bus ");
		speed(s);
		System.out.print("bus ");
		isRunning();
	}
	static void func2()
	{
		System.out.println("bus function");
	}
}
