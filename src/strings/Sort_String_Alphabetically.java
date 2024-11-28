package strings;

public class Sort_String_Alphabetically {

	public static void main(String[] args) {
		
		 // Custom string input
        String str = "geeksforgeeks";
       
        // Converting string into an array for computation
        char arr[] = str.toCharArray();
 
        // Nested loops for comparison of characters
        // in above character array
       
        char temp;
 
        for  (int i=0; i < arr.length;i++) {
            int j = i + 1;
            for  (j=0;j < arr.length;j++) {
                if (arr[j] > arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
              
            }
           
        }
 
        // By now loop is done means we have
        // iterated the whole array
        System.out.println(arr);
    }
	}


