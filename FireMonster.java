package polymorphism;

public class FireMonster xtends Monster {
    public FireMonster(String name){
        super(name);
    }

    public String attack(){
        return "Attack with Fire!";
    }
}
