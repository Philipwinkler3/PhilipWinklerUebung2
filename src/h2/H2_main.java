package h2;

public class H2_main {
	public static void main (String[] args) {
		int i=10;
		int j=500;
		int k=80;
		int min;
		int max;
		
		//Maximum
		if (i > j && i > k) {
            max = i;
        } 
		else if (j > i && j > k) {
            max = j;
        } 
		else {
            max = k;
        }
		System.out.println("Maximum:"+max);
		
		//Minimum
		if (i < j && i < k) {
			min = i;
		}
		else if (j < i && j < k) {
			min=j;
		}
		else {
			min=k;
		}
		System.out.println("Minimum"+min);
		
	}
}
