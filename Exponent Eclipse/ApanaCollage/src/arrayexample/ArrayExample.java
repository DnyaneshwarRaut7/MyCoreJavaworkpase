package arrayexample;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		String [] s = {"mauli","vikas","rushi"};
		
		System.out.println(s.length);
		
		System.out.println(s[2]);
		
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		for(String k:s) {
			System.out.println(k);
		}
		
	}

}
