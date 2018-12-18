package manager;

public class CommandWords {
    private static final String[] validCommands= {"next","help","quit","table","info","coins"};

    public CommandWords()
    {
    }
    public boolean isCommand(String aString)
    {
        for(int i=0 ; i<validCommands.length ; i++)
        {
            if(validCommands[i].equals(aString)) {
                return true;
            }
        }
        return false;
    }

    public String showAllCommands()
    {
        String returner="";
        for(String command:validCommands)
        {
            returner+=" "+command+"%n";
        }
        return returner;
    }
}