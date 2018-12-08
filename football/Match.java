package football;
import java.util.Random;

public class Match {
	private Team home;
	private Team away;
	
	
	public Match(Team a,Team b)
	{
		home=a;
		away=b;
	}
	
	public static int getRandom(int[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	
	public int calculateHomeGoal()
	{
		int result1[]= {0,1,2,3};
		int result2[]= {1,2,3,4,5,6};
		int result3[]= {0,1,2};
		int diff=home.getOffence()-away.getDefence();
		if(diff<0)
		{
		    int rnd = new Random().nextInt(result3.length);
	        return result3[rnd];
	    }
		if(diff>10)
		{
			int rnd = new Random().nextInt(result2.length);
		    return result2[rnd];
		}
		else
		{
			int rnd = new Random().nextInt(result1.length);
		    return result1[rnd];
		}
	}
	public int calculateAwayGoal()
	{
		int result1[]= {0,1,2,3};
		int result2[]= {1,2,3,4};
		int result3[]= {0,1};
		int diff=away.getOffence()-home.getDefence();
		if(diff<0)
		{
		    int rnd = new Random().nextInt(result3.length);
	        return result3[rnd];
	    }
		if(diff>10)
		{
			int rnd = new Random().nextInt(result2.length);
		    return result2[rnd];
		}
		else
		{
			int rnd = new Random().nextInt(result1.length);
		    return result1[rnd];
		}
	}
	public void calculatePoints(int a,int b)
	{
		if(a>b)
			{
			home.changePoints(3);
			home.increaseBudget(2);
		    home.incrementWins();
		    away.incrementLoses();
		    }
		else if(a<b)
			{
			away.changePoints(3);
			away.increaseBudget(3);
			away.incrementWins();
			home.incrementLoses();
			}
		else if(a==b)
		{
			home.changePoints(1);
			away.changePoints(1);
			home.increaseBudget(1);
			away.increaseBudget(1);
			home.incrementDraws();
			away.incrementDraws();
		}
			
	}
	
	public void playMatch()
	{
		if(!home.getName().equals(away.getName()))
		{
			int hg=calculateHomeGoal();
			home.incrementGoalsScored(hg);
			int ag=calculateAwayGoal();
			away.incrementGoalsScored(ag);
			calculatePoints(hg,ag);
			System.out.println("Result in "+home.getName()+"-"+away.getName()+" is: "+hg+"-"+ag);
		}
		else System.out.println("A team cannot play against itself!!");
	}
	
	

}
