package monstergame;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        super.attack();
        return "Attack with fire!";
    }

}
