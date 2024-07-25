package monstergame;

public class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }
    @Override
    public String attack(){
        super.attack();
        return "Attack with water!";
    }

}
