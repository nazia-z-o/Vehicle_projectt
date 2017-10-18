package project_vehicle;

public class aeroplane extends water {
	aeroplane()
	{}
	aeroplane(int s)
	{
		System.out.print("aeroplane ");
		speed(s);
		System.out.print("aeroplane ");
		isRunning();
	}
	static void func5()
	{
		System.out.println("aeroplane function");
	}
}
