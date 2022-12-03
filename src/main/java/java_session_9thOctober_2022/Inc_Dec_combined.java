package java_session_9thOctober_2022;

public class Inc_Dec_combined {

	public static void main(String[] args) {
		int i =1;
		//latest value of is i 1
		
		int j = ++i - --i;
		
		// i  = 2      1
		//  j = 1+1 - 1  = 1
		
		//latest value of is i is 1 and j is 1
		
		System.out.println(i);
		System.out.println(j);
		
		int k = j-- - --i + i-- - --j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		
		int l = --k - k-- + i-- - --i + j++ - --j;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
