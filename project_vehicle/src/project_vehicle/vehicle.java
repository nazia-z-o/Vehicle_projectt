package project_vehicle;

public class vehicle {
	int speed=0;
	void speed(int s)
	 {
		speed=s;
		System.out.println("speed is "+s+"km/hr");

     }
	void isRunning()
	{
		if(speed==0)
		{
			System.out.println("is not running");
        }
		else
		{
			System.out.println("is running");
	    }
	}
}
