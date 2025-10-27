package p3;

public class test {
	public static void main(String[] args) {
		int[] ivalues= {101,210,210,2,140};
		int[] jvalues= {8,8,102,3,150};
		int k=0;
		
		
		for(int a=0; a<ivalues.length; a++) {
			
			int i=ivalues[a];
			int j=jvalues[a];
			
			System.out.println(i);
			System.out.println(j);


			
			
			if(i>j) {
				if(i<=200 && j<=100) {
					k=1;
				}
				else if(i>200 && j<=100) {
					k=2;
				}
				else if(i>200 && j>100) {
					k=3;
				}}
			else if(i<j && i<=200 && j<=100) {
				k=4;
			}
			else {
				k=-10;
			}
			System.out.println(k);
			System.out.println("");
			
		}
		
		
	}

}
