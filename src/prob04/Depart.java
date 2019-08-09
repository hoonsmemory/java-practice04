package prob04;

public class Depart extends Employee {
	String department;

	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		//super.getInformation();
		System.out.println( "이름 : " + super.getName() + " 연봉 : " + super.getSalary() +  " 부서 : " + this.department );

	}
	
	
}
