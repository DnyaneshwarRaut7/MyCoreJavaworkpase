package Com.HashSet;

import java.util.Iterator;
import java.util.Set;

public class Univerty {

	public static void main(String[] args) {

		Collage cc = new Collage();

		Set<Student> uni = cc.addStudentdetails();

		Iterator<Student> itr = uni.iterator();

		while (itr.hasNext()) {

			Student i = itr.next();

			System.out.println(i.id + " " + i.sname + " " + i.address + " " + i.mark + " " + i.mno);

		}

		System.out.println("======= for each loop ===========");

		for (Student s : uni) {

			System.out.println(s.id + " " + s.sname + " " + s.address + " " + s.mark + " " + s.mno);

		}

	}

}
