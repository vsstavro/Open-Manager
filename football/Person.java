package football;

public abstract class Person {
	private String Fname;
	private String Lname;
	private int contract;
	private Team employee;
	
	public Person(String Fname,String Lname,int contract,Team employee)
	{
		this.Fname=Fname;
		this.Lname=Lname;
		this.contract=contract;
		this.employee=employee;
		employee.addPerson(this);
	}
	public abstract int getOffence();
	public abstract int getDefence();

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}
	
	public Team getEmployee()
	{
		return employee;
	}
	public void changeEmployee(Team a)
	{
		employee=a;
	}
	public int getContract() {
		return contract;
	}

	public void setContract(int contract) {
		this.contract = contract;
	}

	

}
