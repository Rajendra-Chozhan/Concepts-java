package programs.arrays;


public class CommonValuesinTwoArrays {
	
	public static void main(String[] args) {


		int []arr1 = {1,2,3,4,8,7,9,6};
		
		int []arr2 = {8,4,7,10,11,12,1,9,8,7,5,5};
		
		
		commonvalues( arr1, arr2);
		
	}
	
	static void commonvalues(int[] arr1, int[] arr2) {
		
		for (int i = 0; i < arr1.length;i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {



					System.out.print(arr2[j] + " ");

				}

			}
		}
		
		
		
		
	}
	

	
}
