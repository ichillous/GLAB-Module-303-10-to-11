package inheritance;//Guided Lab -303.10.1 -
//Inheritance and Object Type Casting

public class Person {
    String name;
    static int lifeSpan = 60;
    static double ageFactor = 1.0;

    //No Args Constructor
    public Person() {
        name = "";
    }

    public Person(String aName){
        name = aName; //
    }

    public String getName(){ return name;}
    public void setName(String aName){name = aName;}
    public String toString(){
        return("Hello my name is " + name);
    }
    public String talk() {
        return("I have nothing to say.");
    }
    public String walk(){
        return("I am now walking");
    }
    public static double lifeSpan(){
        return(lifeSpan * ageFactor);
    }


}
