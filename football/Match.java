package manager;

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
        return calculate(result1, result2, diff);
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
        return calculate(result1, result2, diff);
    }

    private int calculate(int[] result1, int[] result2, int diff) {
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
            home.setPoints(home.getPoints()+3);
            home.incrementWins();
            away.incrementLoses();
        }
        else if(a<b)
        {
            away.setPoints(away.getPoints()+3);
            away.incrementWins();
            home.incrementLoses();

        }
        else if(a==b)
        {
            home.setPoints(home.getPoints()+1);
            away.setPoints(away.getPoints()+1);
            home.incrementDraws();
            away.incrementDraws();
        }

    }


    public void playMatch()
    {
        if(!home.getName().equals(away.getName()))
        {
            int hg=calculateHomeGoal();
            int ag=calculateAwayGoal();
            home.setGoalsFor(hg);
            home.setGoalsAgainst(ag);
            away.setGoalsFor(ag);
            away.setGoalsAgainst(hg);
            calculatePoints(hg,ag);
            System.out.println("Result in "+home.getName()+"-"+away.getName()+" is: "+hg+"-"+ag);
        }
        else System.out.println("A team cannot play against itself!!");
    }



}