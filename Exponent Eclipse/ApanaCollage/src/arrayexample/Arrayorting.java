package arrayexample;

public class Arrayorting {

	public static void main(String[] args) {

		int[] i = new int[5];

		i[3] = 6;
		i[1] = 9;
		i[2] = 0;

		System.out.println(i.length);
		System.out.println(i[1]);

		for (int a = 0; a < i.length; a++) {
			System.out.println(i[a]);

		}
		for (int k : i) {
			System.out.println(k);
		}
		System.out.println("----------------------------------");

		String[] s = { "mauli", "sumit", "vikas" };
		System.out.println(s.length);

		for (int m = 0; m < s.length; m++) {

			System.out.println(s[m]);
		}
		for (String j : s) {
			System.out.println(j);
		}
	}
}
