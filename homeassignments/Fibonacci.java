package day1.homeassignments;

public class Fibonacci {

	public static void main(String[] args) {
   
		int x=0;
		int y=1,z;
		System.out.println("Fibonacci Series:");
		System.out.println(x);
		System.out.println(y);
		for(int i=2;i<8;i++)
		{
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
}
}
