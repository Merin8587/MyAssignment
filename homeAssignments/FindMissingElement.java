package homeAssignments;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[] = {1, 4,3,2,8, 6, 7};  
		int lng = a.length;
// sort the array		
		for (int i=0;i<lng;i++){
			for(int j=i+1;j<lng;j++)
			{
				if(a[i]>a[j])
				{
					int x = a[i];
					a[i]=a[j];
					a[j]=x;
				}
			}
			//System.out.println(a[i]);
			}
// print missing number
		for (int q=0;q<lng;q++)
		{
			if(a[q]!=q+1) {
				System.out.println(q+1);
				break;
			}
			
			
		}
		}
 
	}
