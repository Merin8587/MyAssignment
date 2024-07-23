package day1.homeassignments;

public class IsPrime {

	public static void main(String[] args) {
		int n=7;
		
		for (int i=2;i<n-1;i++) {
				
		if (n%i==0) {
			System.out.println("Given number is non-prime");
			break;
		}
		else {
			System.out.println("Given number is Prime");
			break;
		}
		}	}

}
