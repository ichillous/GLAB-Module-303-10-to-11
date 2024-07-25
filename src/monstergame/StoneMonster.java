package monstergame;

public class StoneMonster extends Monster {
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        super.attack();
        return "Attack with stones!";
    }

}
