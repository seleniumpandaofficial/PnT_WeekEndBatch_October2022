package java_session_9thOctober_2022;

public class IncrementOperations {

	public static void main(String[] args) {
		//increment ++
		
		int i = 1; //the latest value of i is 1
		int j = i++; //j got some value from 1. Now here j is 1, i has to increment itself. i is 2
		//latest value of is is 2, latest value of j is 1
		int k = j++; // k is 1, j is 2
		//latest value of is is 2, j is 2, k is 1
		int l = k++; // l is 1, k is 2
		//latest value of is 2, j is 2, k is 2, l is 1
		
		System.out.println(i); // 2
		System.out.println(j); // 2
		System.out.println(k); // 2
		System.out.println(l); // 1
		
		System.out.println("************************************************************");
		
		
		int m = 1; //here latest value of m is 1
		int n = ++m; //here n becomes 2, m becomes 2
		int o = ++n; //here o becomes 3, n becomes 3
		int p = ++o; // here p becomes 4, o becomes 4
		
		
		
		System.out.println(m); 
		System.out.println(n); 
		System.out.println(o); 
		System.out.println(p); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
