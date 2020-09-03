
public class first { 
	public void salaryslip(int salary); {
		float tax=(float) salary*20/100;
		float netsalary=salary-tax;
		System.out.println("Tax" +tax);
		System.out.println("net salary" + netsalary);
	}

}
