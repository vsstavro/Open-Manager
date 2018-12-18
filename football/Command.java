package manager;

public class Command {
    private String commandWord;

    public Command(String firstWord)
    {
        commandWord=firstWord;
    }

    public String getCommandWord()
    {
        return commandWord;
    }
    public boolean isUnknown()
    {
        return (commandWord==null);
    }

}