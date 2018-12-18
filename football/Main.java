package manager;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    private Scanner reader;
    private Parser parser;
    private Season season;
    private User user;
    private Achievements achs;

    public Main() throws IOException {
        reader=new Scanner(System.in);
        parser=new Parser();
        season=new Season();
        user = new User();
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
            season.progressWeek();
            if(achs.checkThree())
            {
                user.setCoins(user.getCoins()+100);
                System.out.println("You got 100 coins");
            }
            if(achs.checkFive())
            {
                user.setCoins(user.getCoins()+500);
                System.out.println("You got 500 coins");
            }
            if(achs.checkTen())
            {
                user.setCoins(user.getCoins()+1000);
                System.out.println("You got 1000 coins");
            }
        }
        else if(commandWord.equals("table"))
        {
            season.table.showTable();
        }
        else if(commandWord.equals("info"))
        {
            season.table.getInfo();
        }
        else if(commandWord.equals("quit"))
        {
            quit();
        }
        else if(commandWord.equals("coins"))
        {
            System.out.println("You have"+user.getCoins()+" coins");
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

    public void train()
    {
        season.picked().calculateOffence();
        season.picked().calculateDefence();
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
        System.out.println("Type 'next' to play next match.");
        System.out.println("Type 'info' to see your teams info.");
        System.out.println("Type 'table' to see league table.");
        System.out.println("Type 'coins' to see coins.");
        System.out.println();
    }


    public void play()
    {
        printWelcome();
        season.pickTeam();
        achs = new Achievements(season.picked());
        boolean finished=false;
        while(!finished)
        {
            Command command=parser.getCommand();
            finished=processCommand(command);
        }
    }

    public static void main(String[] args) throws IOException {
        Main game = new Main();
        game.play();
    }
}
