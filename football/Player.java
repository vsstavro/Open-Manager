package football;

public class Player extends Person {
	private int age;
	private int offence;
	private int defence;
	private String position;
	
	public Player(String fname,String lname,Team empl,int age,int offence,int defence,int cont,String position)
	{
		super(fname,lname,cont,empl);
		this.age=age;
		this.offence=offence;
		this.defence=defence;
		this.position=position;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getOffence() {
		return offence;
	}
	

	public void setOffence(int offence) {
		this.offence = offence;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
