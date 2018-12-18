package manager;

public class Achievements {
    public Team own;
    private boolean win_three;
    private boolean win_five;
    private boolean win_ten;

    public Achievements(Team own)
    {
        this.own = own;
        win_five = false;
        win_three = false;
        win_ten = false;
    }

    public boolean checkThree()
    {
        if(!win_three){
            if(own.getWins()>=3){
                win_three = true;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean checkFive()
    {
        if(!win_five){
            if(own.getWins()>=5){
                win_five = true;
                return true;
            }
            return false;
        }
        return false;
    }
    public boolean checkTen()
    {
        if(!win_ten){
            if(own.getWins()>=10){
                win_ten = true;
                return true;
            }
            return false;
        }
        return false;
    }




}
