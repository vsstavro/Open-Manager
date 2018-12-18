package manager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;


public class LeagueTable {
    public ArrayList<Team> teams;
    public ArrayList<Team> teams_temp;
    public ArrayList<Team> relegated;

    public LeagueTable() throws IOException {
        teams=new ArrayList<Team>();
        teams_temp=new ArrayList<Team>(teams);
        relegated=new ArrayList<Team>();
        File file = new File("C:\\Users\\Stavros\\Teams.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String name;
        while ((name = br.readLine()) != null)
        {
            teams.add(new Team(name));
        }
        File file2 = new File("C:\\Users\\Stavros\\Players.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
        String nextLine;
        String[] info;
        ArrayList<Player> temp = new ArrayList<Player>();
        while((nextLine = br2.readLine()) != null)
        {
            info  = nextLine.split(";");//; would be the delimiter
            String fn = info[0];
            String ln = info[1];
            int off = Integer.parseInt(info[2]);
            int def = Integer.parseInt(info[3]);
            temp.add(new Player(fn,ln,off,def));
        }
        for(int i=0; i<11; i++)
        {
            teams.get(0).players.add(temp.get(i));
        }
        for(int i=11; i<22; i++)
        {
            teams.get(1).players.add(temp.get(i));
        }
        teams.get(0).calculateOffence();
        teams.get(0).calculateDefence();
        teams.get(1).calculateOffence();
        teams.get(1).calculateDefence();
        teams_temp=new ArrayList<Team>(teams);
    }

    public void showTable()
    {
        Collections.sort(teams_temp, new Comparator<Team>() {
            @Override
            public int compare(Team team2, Team team1)
            {

                return  Integer.compare(team1.getPoints(),team2.getPoints());
            }
        });
        System.out.println("NAME\t\t\t POINTS\t WINS\tDRAWS\tLOSES\tGOALS\tCONTROL");
        for (int i = 0; i < teams_temp.size(); i++) {
            System.out.println(i+1+". "+teams_temp.get(i).printName()+"\t   "+teams_temp.get(i).getPoints()+"\t   "+teams_temp.get(i).getWins()+"\t   "+teams_temp.get(i).getDraws()+"\t   "+teams_temp.get(i).getLoses()+"\t   "+teams_temp.get(i).getGoalsFor()+ "\t-- "+teams_temp.get(i).displayUser());
        }
    }

    public void getInfo()
    {
        int i;
        for(i=0;i<teams_temp.size();i++)
        {
            if(teams_temp.get(i).isUser())
            {
                System.out.println(teams_temp.get(i).getName()+":: Offence is "+teams_temp.get(i).getOffence()+" Defence is "+teams_temp.get(i).getDefence());
            }
        }
    }

    public void showSelectionTable()
    {
        for (int i = 0; i < teams_temp.size(); i++) {
            System.out.println(i+1+". "+teams_temp.get(i).printName()+" -- "+teams_temp.get(i).displayUser());
        }
    }

}

