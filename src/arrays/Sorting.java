package arrays;

public class Sorting {

	public static void main(String[] args) {
		
		
		int [] marks = new int[]{42,88,79,65,52,49,39};
		
		
		int temp;
		
		for (int i = 0;i<marks.length;i++) {
			
	for (int j =i+1;j<marks.length;j++) {		
			
		if (marks[i] > marks[j]){
		
			temp = marks[i];
			marks[i] = marks[j];
			marks[j] = temp;
		}

	}}
		
for (int a : marks) {
	System.out.print(a + " ");
	
}

}}
