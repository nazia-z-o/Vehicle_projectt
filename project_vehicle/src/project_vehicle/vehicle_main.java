package project_vehicle;
import java.util.Scanner;

public class vehicle_main {
	static void do_something (vehicle...V)
	{
		for(vehicle T:V)
		if(T instanceof car)
		{
			car.func();
		}
		else if(T instanceof bus)
		{
			bus.func2();
		}
		else if(T instanceof boat)
		{
			boat.func4();
		}
		else if(T instanceof ship)
		{
			ship.func3();
		}
		else if(T instanceof aeroplane)
		{
			aeroplane.func5();
		}
		else if(T instanceof helicopter)
		{
			helicopter.func6();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter test case: ");
		int t=sc.nextInt();
		while(t!=0)
		{
			
			
			 System.out.print("Vehicle: press 1 for car,2 for bus,3 for ship,");
			 System.out.println("4 for boat,5 for aeroplane ,6 for helicopter:");
			 int n=sc.nextInt(); 
			 
			 if(n==1)
		      {
		    	  System.out.println("Enter car speed :\n");
		    	  
		    	
		    	  int s=sc.nextInt();
		    	 
		    	  car carr= new car(s);
		    	  do_something(carr);
		      }
		      else if(n==2)
		      {
		    	  System.out.println("Enter bus speed :\n");
		    	  int s=sc.nextInt();
		    	  bus buss= new bus(s);
		    	  do_something(buss);
		      }
		      
		      else if(n==3)
		      {
		    	  System.out.println("Enter ship speed :\n");
		    	  int s=sc.nextInt();
		    	  ship shipp= new ship(s);
		    	  do_something(shipp);
		      }
		      
		      else if(n==4)
		      {
		    	  System.out.println("Enter boat speed :\n");
		    	  int s=sc.nextInt();
		    	  boat boatt= new boat(s);
		    	  do_something(boatt);
		      }
		      else if(n==5)
		      {
		    	  System.out.println("Enter aeroplane speed :\n");
		    	  int s=sc.nextInt();
		    	  aeroplane aer= new aeroplane(s);
		    	  do_something(aer);
		      }
		      else if(n==6)
		      {
		    	  System.out.println("Enter helicopter speed :\n");
		    	  int s=sc.nextInt();
		    	  helicopter hel= new  helicopter(s);
		    	  do_something(hel);
		      }
			 t--;
	}
	System.out.println("\n\n\n    This is the call of variadic function");
	  do_something(new car(55),new bus(60),new boat(20),new helicopter(80));
	}

}
