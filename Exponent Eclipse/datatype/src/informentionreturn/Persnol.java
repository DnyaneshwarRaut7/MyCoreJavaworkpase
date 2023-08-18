package informentionreturn;

public class Persnol {

	public void m1() {

		System.out.println("==m1 method==");
	}

	public String m2() {
		return "DNYANESHWAR";
	}

	public String m3() {
		return "RAUT";
	}

	public String m4() {
		return "EXPONT";
	}

	public String m5() {
		return "PUNE";
	}

	public int m6() {
		return 01;
	}

	public long m7() {
		return 9146229448l;
	}

	public char m8() {
		return 'a';
	}

	public double m9() {
		return 88.8;
	}

	public Sumit addSumitDetails() {
		Sumit s = new Sumit();
		s.method = "=== m2 method===";
		s.name = "SUMIT";
		s.name1 = "SHINDE";
		s.clgname = "EXPONT";
		s.address = "pune";
		s.rno = 2;
		s.mno = 8600427528l;
		s.per = 89.7f;
		s.div = 'a';
		return s;
	}

	public Tushar addTusharDetails() {
		Tushar t = new Tushar();
		t.method = "=== m3 method===";
		t.name = "TUSHAR";
		t.name1 = "PAUDMAL";
		t.clgname = "EXPONT";
		t.address = "pune";
		t.rno = 3;
		t.mno = 8530428583l;
		t.per = 678.7f;
		t.div = 'a';
		return t;

	}

	public static void main(String[] args) {

		Persnol p = new Persnol();
		p.m1();
		String a = p.m2();
		System.out.println(a);
		String b = p.m3();
		System.out.println(b);
		String c = p.m4();
		System.out.println(c);
		String d = p.m5();
		System.out.println(d);
		int f = p.m6();
		System.out.println(f);
		long g = p.m7();
		System.out.println(g);
		char h = p.m8();
		System.out.println(h);
		double i = p.m9();
		System.out.println(i);

		Sumit s2 = p.addSumitDetails();

		System.out.println(s2.method);
		System.out.println(s2.name);
		System.out.println(s2.name1);
		System.out.println(s2.clgname);
		System.out.println(s2.address);
		System.out.println(s2.rno);
		System.out.println(s2.mno);
		System.out.println(s2.div);
		System.out.println(s2.per);

		Tushar t2 = p.addTusharDetails();

		System.out.println(t2.method);
		System.out.println(t2.name);
		System.out.println(t2.name1);
		System.out.println(t2.clgname);
		System.out.println(t2.address);
		System.out.println(t2.rno);
		System.out.println(t2.mno);
		System.out.println(t2.div);
		System.out.println(t2.per);

	}

}
