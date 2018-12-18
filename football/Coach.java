package manager;

public class Coach extends Person {
    private int attackMentality;
    private int defenceMentality;

    public Coach(String firstName, String lastName, int att , int def)
    {
        super(firstName, lastName);
        attackMentality = att;
        defenceMentality = def;
    }

    public int getAttackMentality() {
        return attackMentality;
    }

    public void setAttackMentality(int attackMentality) {
        this.attackMentality = attackMentality;
    }

    public int getDefenceMentality() {
        return defenceMentality;
    }

    public void setDefenceMentality(int defenceMentality) {
        this.defenceMentality = defenceMentality;
    }
}
