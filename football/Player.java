package manager;

public class Player extends Person {
    private int offence;
    private int defence;

    public Player(String firstName, String lastName , int offence , int defence) {
        super(firstName, lastName);
        this.offence = offence;
        this.defence = defence;
    }

    public int getOffence() {
        return offence;
    }

    public void setOffence(int offence) {
        this.offence = offence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
