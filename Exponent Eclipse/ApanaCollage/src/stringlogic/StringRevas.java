package stringlogic;

public class StringRevas {

	public static void main(String[] args) {

		String s = "madam";
		String rev = " ";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		// palandroem

		if (s.equals(rev)) {

			System.out.println("palandrom String");
		} else {
			System.out.println("Not palandrom");
		}

	}

}
