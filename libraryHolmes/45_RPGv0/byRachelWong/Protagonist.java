public class Protagonist {
    private String name;
    private int life;
    private int strength;
    private int defense;
    private double accuracy;

    public Protagonist(String input) {
        name = input;
        life = 300;
        strength = (int) (Math.random() * 45 + 20);
        defense = 35;
        accuracy = 0.4;
    }

    public Protagonist(String input, int hp, int str, int def, double acc) {
        name = input;
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

    public String getName() {
        return name;
    }

    public void lowerHp(int damage){
        life -= damage;
    }

    public int attack(Monster victim){
        int dealt = (int) (strength * accuracy - victim.getDefense());
        victim.lowerHp(dealt);
        return dealt;
    }

    public void specialize(){
        accuracy = accuracy * 2;
        defense = defense / 2 - 5;
    }

    public void normalize(){
        accuracy = accuracy / 2;
        defense = (defense + 5) * 2;
    }

    //toString for testing
    public String toString() {
        return System.lineSeparator() + "name: " + name +
               "\nlife: " + life +
               "\nstrength: " + strength +
               "\ndefense: " + defense +
               "\naccuracy: " + accuracy +
               "\nalive?: " + isAlive();
    }
}
