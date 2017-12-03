public class Monster{

    private int life;
    private int strength;
    private int defense;
    private double accuracy;

    //constructor for basic monsters
    public Monster(){
        life = 150;
        strength = (int) (Math.random() * 45 + 20);
        defense = 20;
        accuracy = 1.0;
    }

    //For the special monsters
    public Monster(int hp, int str, int def, double acc){
        life = hp;
        strength = str;
        defense = def;
        accuracy = acc;
    }

    public boolean isAlive(){
        return life > 0;
    }

    public int getDefense(){
        return defense;
    }

    public void lowerHp(int damage){
        life -= damage;
    }

    public int attack(Protagonist target){
        int dealt = (int) (strength * accuracy - target.getDefense());
        target.lowerHp(dealt);
        return dealt;
    }

    //toString for testing
    public String toString() {
        return System.lineSeparator() + "life: " + life +
               "\nstrength: " + strength +
               "\ndefense: " + defense +
               "\naccuracy: " + accuracy +
               "\nalive?: " + isAlive();
    }
}
