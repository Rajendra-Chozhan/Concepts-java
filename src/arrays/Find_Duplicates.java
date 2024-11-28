package arrays;

public class Find_Duplicates {
	 public static void main(String[] args) {

	        
	        int [] arr = {1,2,3,2,5,6,1};
	       
	        System.out.println("The duplicates in array are");
	        
	        for (int i=0;i<arr.length;i++){
	            
	            for (int j=i+1;j<arr.length;j++){
	                
	                
	                if (arr[i]==arr[j]){
	                
	                System.out.println(arr[j]);
	                }
	                
	            }
	            
	            
	            
	        }
	    }
}
