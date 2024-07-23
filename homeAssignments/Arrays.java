package homeAssignments;

public class Arrays {

	public static void main(String[] args) {
		int[] array1 = {3,2,11,4,6,7};  
		int[] array2 ={1,2,8,4,9,7}; 
	int lng1 = array1.length;
	int lng2 = array2.length;
	System.out.println("Matching values in both arrays are:");
	for (int i=0; i<lng1;i++) {
		for (int j=0;j<lng2;j++) {
			if (array1[i]==array2[j])
				System.out.println(array1[i]);
		}
	}
	}

}
