package staticandnonstaticblock;

import java.net.MulticastSocket;

public class EmployeTestMain {

	public static void main(String[] args) {
		Employe emp = new Employe();
		emp.id = 100;
		emp.name ="MAULI";
		emp.address = "RAJURI";
		System.out.println(emp);
		EmployeTestMain main = new EmployeTestMain();
		
		main.display(emp);
		//System.out.println(emp.toString);
		System.out.println();
		
		
	}
		
		
		public void display(Employe em) {
			System.out.println(em.id = 44);
			System.out.println(em.name = "suraj");
		}
	}


