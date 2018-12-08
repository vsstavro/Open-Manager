package football;



import java.util.Scanner;


public class Main {
	
	 public LeagueTable table;
	 private Scanner reader;
	 private Parser parser;
	 private Season season;

	 
	
	public Main()
	{
		
		reader=new Scanner(System.in);
		table=new LeagueTable();
		parser=new Parser();
		season=new Season();
		
		
	}
	
	public int nextFixture()
	{
		System.out.println("Press n to continue");
		char c = reader.next().charAt(0);
		if(c=='n')
			return 1;
		else 
			return 0;
			
		
	}	
	
	
	public boolean processCommand(Command command)
	{
		boolean wantToQuit=false;
		if(command.isUnknown())
		{
			System.out.println("Please enter a valid command word");
			return false;
		}
		
		String commandWord=command.getCommandWord();
		if(commandWord.equals("help"))
		{
			printHelp();
		}
		else if(commandWord.equals("next"))
		{
			progress();
		}
		else if(commandWord.equals("pay"))
		{
			pay();
		}
		else if(commandWord.equals("table"))
		{
			season.table.showTable();
		}
		else if(commandWord.equals("info"))
		{
			season.table.getInfo();
		}
		else if(commandWord.equals("enstasi"))
		{
			season.table.enstasi();
		}
		else if(commandWord.equals("remove"))
		{
			season.table.removal();
		}
		else if(commandWord.equals("quit"))
		{
			quit();
		}
		
		return wantToQuit;
	}
	public void printHelp()
	{
		System.out.println("This is Greek Superleague");
	    System.out.println("and you compete for the ultimate goal");
	    System.out.println("the Greek Championship.");
	    System.out.println();
	    System.out.println("Your command words are:");
	    System.out.printf(parser.showCommands());
	}
	public void progress()
	{
		season.progressWeek();
	}
	public void pay()
	{
		int i;
		for(i=0;i<season.table.teams_temp.size();i++)
			if(season.table.teams_temp.get(i).getUser())
			{
				if(season.table.teams_temp.get(i).getBudget()>=10)
				{
					season.table.teams_temp.get(i).decreaseBudget(10);
				    season.table.teams_temp.get(i).increaseStats();
				    System.out.println("Somehow your stats went up - Hmm...Curious");
				}
				else
					System.out.println("Not enough money honey!!");
				
			}
	}
	public void quit()
	{
		System.exit(0);
	}

	
	public void printWelcome()
	{
		System.out.println();
	    System.out.println("Welcome to Greek Superleague!");
	    System.out.println("Can you be a champion or you were born a loser?");
	    System.out.println("Type 'help' if you need help.");
	    System.out.println("Type 'quit' if you want to quit.");
	    System.out.println("Type 'pay' to increase your relations with EPO.");
	    System.out.println("Type 'next' to play next match.");
	    System.out.println("Type 'info' to see your teams info.");
	    System.out.println("Type 'table' to see league table.");
	    System.out.println("Type 'remove' to kick your player.");
	    System.out.println("Type 'enstasi' to file a lawsuit against your closest opponent in the table.");
	    System.out.println();

	    
	}
	

	
	
	public void play()
	{
		printWelcome();
		season.pickTeam();
		
		boolean finished=false;
		while(!finished)
		{
			Command command=parser.getCommand();
			finished=processCommand(command);
		}
		
	}

	
	public static void main(String[] args)
	{
		Main a=new Main();
		a.play();
		
	}

}
