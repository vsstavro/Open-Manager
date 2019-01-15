package manager;

import java.util.Random;
import java.util.Scanner;
//import java.util.StringTokenizer;

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
            if (home.isUser()) //PREPEI NA TO VALW STO TEAM
            {
                Boolean ok=false;
                do {
                    Scanner keyboard = new Scanner(System.in);
                    System.out.println("Choose Team Mentality");
                    System.out.println("Attack + Defense should add to 100");
                    System.out.println("Enter Attack Percentage");
                    int attperc = keyboard.nextInt();
                    System.out.println("Enter Defence Percentage");
                    int defperc = keyboard.nextInt();
                    if (attperc+defperc=100 && attperce*defperc>0)
                    {   
                        ok=true;
                    }    
                } while (ok!=true);
                //krataw tis arxikes times
                int save_offence=home.getOffence();
                int save_defence=home.getDefence();
                //ypologismos statistikwn
                if (attperc>50)
                {
                    int boost =(attperc-50)/5; //na epe3igisw
                    home.setOffense(home.getOffence()+boost);
                    home.setDefence(home.getDefence()-boost);
                }
                if (attperc<50)
                {
                    int boost =(attperc-50)/5; //na epe3igisw
                    home.setOffense(home.getOffence()+boost);
                    home.setDefence(home.getDefence()-boost);
                }
            } else if (away.isUser());
            {
                Boolean ok=false;
                do {
                    Scanner keyboard = new Scanner(System.in);
                    System.out.println("Choose Team Mentality");
                    System.out.println("Attack + Defense should add to 100");
                    System.out.println("Enter Attack Percentage");
                    int attperc = keyboard.nextInt();
                    System.out.println("Enter Defence Percentage");
                    int defperc = keyboard.nextInt();
                    if (attperc+defperc=100 && attperce*defperc>0)
                    {   
                        ok=true;
                    }    
                } while (ok!=true);
                //krataw arxikes times
                int save_offence=away.getOffence();
                int save_defence=away.getDefence();
                //ypologismos newn statistikwn
                if (attperc>50)
                {
                    int boost =(attperc-50)/5; //na epe3igisw
                    away.setOffense(away.getOffence()+boost);
                    away.setDefence(away.getDefence()-boost);
                }
                if (attperc<50)
                {
                    int boost =(attperc-50)/5; //na epe3igisw
                    away.setOffense(away.getOffence()+boost);
                    away.setDefence(away.getDefence()-boost);
                }     
            }
            int hg=calculateHomeGoal();
            int ag=calculateAwayGoal();
            home.setGoalsFor(hg);
            home.setGoalsAgainst(ag);
            away.setGoalsFor(ag);
            away.setGoalsAgainst(hg);
            calculatePoints(hg,ag);
            System.out.println("Result in "+home.getName()+"-"+away.getName()+" is: "+hg+"-"+ag);
            //Epistrefw stis pragmatikes times
            if (home.isUser())
            {
                home.setOffence()=save_offence;
                home.setDefence()=save_defence;
            }
            if (away.isUser())
            {
                away.setOffence()=save_offence;
                away.setDefence()=save_defence;
            }
        }
        else System.out.println("A team cannot play against itself!!");
    }



}
