package manager;

import java.util.Scanner;
//import java.util.StringTokenizer;

public class Parser {
    private Scanner reader;
    private CommandWords commands;

    public Parser()
    {
        reader=new Scanner(System.in);
        commands=new CommandWords();
    }

    public Command getCommand()
    {
        String input;
        String word1=null;
        System.out.print("> ");
        input=reader.nextLine();
        Scanner tokenizer=new Scanner(input);
        if(tokenizer.hasNext())
        {
            word1=tokenizer.next();
        }
        if(commands.isCommand(word1))
        {
            return new Command(word1);
        }
        else
        {
            return new Command(null);
        }
    }

    public String showCommands()
    {
        return commands.showAllCommands();
    }

}