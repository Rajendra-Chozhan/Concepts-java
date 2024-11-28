package arrays;


import java.util.Set;
import java.util.HashSet;
public class CommonValuesinTwoArrays {
	
	public static void main(String[] args) {


		int []arr1 = {1,2,3,4,8,7,9,6};
		
		int []arr2 = {8,4,7,10,11,12,1};
		
		
		commonvalues( arr1, arr2);
		
	}
	
	static void commonvalues(int[] arr1, int[] arr2) {
		
		
		Set<Integer> s = new HashSet();
		
		for (int i = 0; i < arr1.length;i++) {
			
			s.add(arr1[i]);
			
		}
		
		
		for (int j =0;j<arr2.length;j++) {
			
			if(s.contains(arr2[j])) {
				
				System.out.print( arr2[j] + " " );
				
			}	
			
		}
		
		
		
		
		
	}
	

	
}
