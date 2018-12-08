package football;
import java.util.ArrayList;

public class Team 
{
	private int offence;
	private int defence;
	private int points;
	private int wins;
	private int draws;
	private int loses;
	private int goalsScored;
	private int budget;
	private ArrayList<Person> persons;
	private String name;
	private boolean user;
	
	
	public Team()
	{
		
	}
	
	public Team(String n,boolean us,int bud)
	{
		offence=0;
		defence=0;
		name=n;
		points=0;
		wins=0;
		draws=0;
		loses=0;
		goalsScored=0;
		persons=new ArrayList<Person>();
		user=us;
		budget=bud;
	}
	public void removePlayer()
	{
		persons.remove(0);	
	}
	
	public void calculateOffence()
	{
		int i;
		for(i=0;i<persons.size();i++)
		{
			offence=offence+persons.get(i).getOffence();
		}
		offence=offence/11;
		
	}
	public void calculateDefence()
	{
		int i;
		for(i=0;i<persons.size();i++)
		{
			defence=defence+persons.get(i).getDefence();
		}
		defence=defence/11;
		
	}
	
	public void increaseBudget(int k)
	{
		budget=budget+k;
	}
	public int getBudget()
	{
		return budget;
	}
	public void decreaseBudget(int k)
	{
		budget=budget-k;
	}
	public void emptyBudget()
	{
		budget=0;
	}
	public void incrementBudget(int k)
	{
		budget=budget+k;
	}
	
	public int getWins() {
		return wins;
	}
	public void clearWins()
	{
		wins=0;
	}
	
	public void clearLoses()
	{
			loses=0;
	}
	public void clearDraws()
	{
		draws=0;
	}
	public void clearGoals()
	{
		goalsScored=0;
	}
	public void clearPoints()
	{
		points=0;
	}

	public void incrementWins() {
		wins=wins+1;
	}

	public int getDraws() {
		return draws;
	}

	public void incrementDraws(){
		draws=draws+1;
	}

	public int getLoses() {
		return loses;
	}

	public void incrementLoses() {
	    loses = loses+1;
	}

	public int getGoalsScored() {
		return goalsScored;
	}

	public void incrementGoalsScored(int k) {
		goalsScored = goalsScored+k;
	}
	
	public void setUser()
	{
		user=true;
	}
	public boolean getUser()
	{
		return user;
			
	}
	public String displayUser()
	{
		String p="PLAYER";
		String c="CPU";
		boolean isUser=getUser();
		if(isUser==true)
		{
			return p;
		}
		else
		{
			return c;
		}
	}
	public String getName()
	{
		return name;
	}
	public void addPerson(Person p)
	{
		persons.add(p);
	}
	public void removePerson(Person p)
	{
		persons.remove(p);
	}
	public void showPlayers()
	{
		int i;
		for(i=0;i<persons.size();i++)
		{
			System.out.println(persons.get(i).getFname()+" "+persons.get(i).getLname());
		}
	}
	public int getOffence()
	{
		return offence;
	}
	public void increaseStats()
	{
		offence=offence+1;
		defence=defence+1;
	}
	public int getDefence()
	{
		return defence;
	}
	public int getPoints()
	{
		return points;
	}
	public void changePoints(int plus)
	{
		points=points+plus;
	}
	public void cutPoints()
	{
		points=points-3;
	}
	
	
}
