package football;

import java.util.Scanner;

public class Season {
	private int week;
	public LeagueTable table;
	 private Scanner reader;
	 
	
	public Season()
	{
		week=1;
		table=new LeagueTable();
		reader=new Scanner(System.in);
		
	}
	public void printWeek(int j)
	{
		System.out.println("This is week "+j);
	}
	public void Week(int i)
	{
		
		if(i==1)
		{
			
			printWeek(i);
			Match m11=new Match(table.teams.get(0),table.teams.get(1));
			m11.playMatch();
			Match m12=new Match(table.teams.get(2),table.teams.get(3));
			m12.playMatch();
			Match m13=new Match(table.teams.get(4),table.teams.get(5));
			m13.playMatch();
			Match m14=new Match(table.teams.get(6),table.teams.get(7));
			m14.playMatch();
			
			
		}
		if(i==2)
		{
			printWeek(i);
			Match m21=new Match(table.teams.get(0),table.teams.get(2));
			m21.playMatch();
			Match m22=new Match(table.teams.get(1),table.teams.get(3));
			m22.playMatch();
			Match m23=new Match(table.teams.get(4),table.teams.get(6));
			m23.playMatch();
			Match m24=new Match(table.teams.get(5),table.teams.get(7));
			m24.playMatch();
		}
		if(i==3)
		{
			printWeek(i);
			Match m31=new Match(table.teams.get(0),table.teams.get(3));
			m31.playMatch();
			Match m32=new Match(table.teams.get(2),table.teams.get(1));
			m32.playMatch();
			Match m33=new Match(table.teams.get(4),table.teams.get(7));
			m33.playMatch();
			Match m34=new Match(table.teams.get(5),table.teams.get(6));
			m34.playMatch();
		}
		if(i==4)
		{
			printWeek(i);
			Match m41=new Match(table.teams.get(4),table.teams.get(0));
			m41.playMatch();
			Match m42=new Match(table.teams.get(3),table.teams.get(6));
			m42.playMatch();
			Match m43=new Match(table.teams.get(1),table.teams.get(5));
			m43.playMatch();
			Match m44=new Match(table.teams.get(7),table.teams.get(2));
			m44.playMatch();
		}
		if(i==5)
		{
			printWeek(i);
			Match m51=new Match(table.teams.get(5),table.teams.get(0));
		    m51.playMatch();
			Match m52=new Match(table.teams.get(4),table.teams.get(1));
			m52.playMatch();
			Match m53=new Match(table.teams.get(2),table.teams.get(6));
		    m53.playMatch();
			Match m54=new Match(table.teams.get(3),table.teams.get(7));
			m54.playMatch();
		}
		if(i==6)
		{
			printWeek(i);
			Match m61=new Match(table.teams.get(6),table.teams.get(0));
			m61.playMatch();
			Match m62=new Match(table.teams.get(1),table.teams.get(7));
			m62.playMatch();
			Match m63=new Match(table.teams.get(3),table.teams.get(4));
			m63.playMatch();
			Match m64=new Match(table.teams.get(5),table.teams.get(2));
			m64.playMatch();
		}
		if(i==7)
		{
			printWeek(i);
			Match m71=new Match(table.teams.get(7),table.teams.get(0));
			m71.playMatch();
			Match m72=new Match(table.teams.get(1),table.teams.get(6));
			m72.playMatch();
			Match m73=new Match(table.teams.get(3),table.teams.get(5));
			m73.playMatch();
			Match m74=new Match(table.teams.get(4),table.teams.get(2));
			m74.playMatch();
		}
		if(i==8)
		{
			printWeek(i);
			Match m81=new Match(table.teams.get(1),table.teams.get(0));
			m81.playMatch();
			Match m82=new Match(table.teams.get(3),table.teams.get(2));
			m82.playMatch();
			Match m83=new Match(table.teams.get(5),table.teams.get(4));
			m83.playMatch();
			Match m84=new Match(table.teams.get(7),table.teams.get(6));
			m84.playMatch();
		}
		if(i==9)
		{
			printWeek(i);
			Match m91=new Match(table.teams.get(2),table.teams.get(0));
			m91.playMatch();
			Match m92=new Match(table.teams.get(3),table.teams.get(1));
			m92.playMatch();
			Match m93=new Match(table.teams.get(6),table.teams.get(4));
			m93.playMatch();
			Match m94=new Match(table.teams.get(7),table.teams.get(5));
			m94.playMatch();
		}
		if(i==10)
		{
			printWeek(i);
			Match m101=new Match(table.teams.get(3),table.teams.get(0));
			m101.playMatch();
			Match m102=new Match(table.teams.get(1),table.teams.get(2));
			m102.playMatch();
			Match m103=new Match(table.teams.get(7),table.teams.get(4));
			m103.playMatch();
			Match m104=new Match(table.teams.get(6),table.teams.get(5));
			m104.playMatch();
		}
		if(i==11)
		{
			printWeek(i);
			Match m111=new Match(table.teams.get(0),table.teams.get(4));
			m111.playMatch();
			Match m112=new Match(table.teams.get(6),table.teams.get(3));
			m112.playMatch();
			Match m113=new Match(table.teams.get(5),table.teams.get(1));
			m113.playMatch();
			Match m114=new Match(table.teams.get(2),table.teams.get(7));
			m114.playMatch();
		}
		if(i==12)
		{
			printWeek(i);
			Match m121=new Match(table.teams.get(0),table.teams.get(5));
		    m121.playMatch();
			Match m122=new Match(table.teams.get(1),table.teams.get(4));
			m122.playMatch();
			Match m123=new Match(table.teams.get(6),table.teams.get(2));
		    m123.playMatch();
			Match m124=new Match(table.teams.get(7),table.teams.get(3));
			m124.playMatch();
		}
		if(i==13)
		{
			printWeek(i);
			Match m131=new Match(table.teams.get(0),table.teams.get(6));
			m131.playMatch();
			Match m132=new Match(table.teams.get(7),table.teams.get(1));
			m132.playMatch();
			Match m133=new Match(table.teams.get(4),table.teams.get(3));
			m133.playMatch();
			Match m134=new Match(table.teams.get(2),table.teams.get(5));
			m134.playMatch();
		}
		if(i==14)
		{
			printWeek(i);
			Match m141=new Match(table.teams.get(0),table.teams.get(7));
			m141.playMatch();
			Match m142=new Match(table.teams.get(6),table.teams.get(1));
			m142.playMatch();
			Match m143=new Match(table.teams.get(5),table.teams.get(3));
			m143.playMatch();
			Match m144=new Match(table.teams.get(2),table.teams.get(4));
			m144.playMatch();
			table.showTable();
			System.out.println("Champion is "+table.teams_temp.get(0).getName());
			for (int j = 0; j < table.teams_temp.size(); j++) {
				if(table.teams_temp.get(j).displayUser().equalsIgnoreCase("PLAYER"))
						System.out.println("Your team finished in postion >> "+ (j+1) +" <<");
			}
			Update();
		}
		if(i>14)
		{
			week=1;
			Week(1);
		}
			
		
	}
	public void incrementWeek()
	{
		 week=week+1;
	}
	public int getWeek()
	{
		return week;
	}
	public void pickTeam()
	{
		table.showSelectionTable();
	    System.out.println("Pick a Team by its number");
		int n = reader.nextInt();
		table.teams_temp.get(n-1).setUser();
				
	}
	
	
	
	public void progressWeek()
	{
		Week(week);
		incrementWeek();
	}
	
	public void Update()
		{
		
		int i;
		for(i=0;i<table.teams.size();i++)
		{
			table.teams_temp.get(i).clearDraws();
			table.teams_temp.get(i).clearLoses();
			table.teams_temp.get(i).clearWins();
			table.teams_temp.get(i).clearGoals();
			table.teams_temp.get(i).clearPoints();
		}
		int j;
		boolean done=false;
		for(j=0;j<table.teams.size();j++)
			{
			if(table.teams.get(j).getName().equals(table.teams_temp.get(7).getName()) && !done)
				{
				table.relegated.add(table.teams.get(j));
				table.teams.remove(j);
				table.teams_temp.remove(7);
				table.teams.add(table.relegated.get(0));
				table.teams_temp.add(table.relegated.get(0));
				table.showTable();
				table.relegated.remove(table.relegated.get(0));
				
				done=true;
				}
			}
	}

}
