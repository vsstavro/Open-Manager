package manager;

import java.util.ArrayList;

public class Team {
    private String name;
    private int offence;
    private int defence;
    private boolean user;
    private int points;
    private int wins;
    private int draws;
    private int loses;
    private int goalsFor;
    private int goalsAgainst;
    public ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        offence = 0;
        defence = 0;
        user = false;
        points = 0;
        wins = 0;
        draws = 0;
        loses = 0;
        goalsFor = 0;
        goalsAgainst = 0;
        players = new ArrayList<Player>();
    }

    public String displayUser()
    {
        String p="PLAYER";
        String c="CPU";
        if(user==true)
        {
            return p;
        }
        else
        {
            return c;
        }
    }

    public String getName() {
        return name;
    }

    public String printName()
    {
        String full = name;
        int space = 12 - name.length();
        for(int i=0; i<space; i++)
            full = full + " ";
        return full;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOffence() {
        return offence;
    }

    public void setOffence(int offence) {
        this.offence = offence;
    }

    public void calculateOffence()
    {
        int temp = 0;
        for(Player player : players)
        {
            temp = temp + player.getOffence();
        }
        temp = temp/11;
        offence = temp;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void calculateDefence()
    {
        int temp = 0;
        for(Player player : players)
        {
            temp = temp + player.getDefence();
        }
        temp = temp/11;
        defence = temp;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void incrementWins() {
        wins++;
    }

    public int getDraws() {
        return draws;
    }

    public void incrementDraws() {
        draws++;
    }

    public int getLoses() {
        return loses;
    }

    public void incrementLoses() {
        loses++;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goals) {
        goalsFor = goalsFor + goals;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goals) {
        goalsAgainst = goalsAgainst + goals;
    }

    public void clear()
    {
        points = 0;
        goalsFor = 0;
        goalsAgainst = 0;
        wins = 0;
        loses = 0;
        draws = 0;
    }

    public void offenceTraining()
    {
        for(Player player : players) {
            player.setOffence(player.getOffence()+1);
        }
        calculateOffence();
    }

    public void defenceTraining()
    {
        for(Player player : players) {
            player.setDefence(player.getDefence()+1);
        }
        calculateDefence();
    }
}
