public class TestMonster{
    public static void main(String[] arg){

        Monster basic = new Monster();
        Monster boss = new Monster(1000, 100, 100, 10);

        System.out.println(System.lineSeparator() + "basic: " + basic + "\n");
        System.out.println(System.lineSeparator() + "boss: " + boss + "\n");

        System.out.println("Boss alive?: " + boss.isAlive());
        
        System.out.println("defense of basic: " + basic.getDefense());

        boss.lowerHp(250);
        System.out.println("boss after loosing 250 health: \n" + boss + "\n");

        Protagonist hero = new Protagonist("Pikachu");
            System.out.println("*****Before battle:***** \n" +
                               "\nhero: " + hero + "\n" +
                               "\nbasic: " + basic + "\n");

            System.out.println("*****Battle start!***** \n");

            System.out.println("Hero dealt: " + hero.attack(basic));
            System.out.println("Monster's current stats: " + System.lineSeparator() +
                                basic + "\n");

            System.out.println("Monster dealt: " + basic.attack(hero));
            System.out.println("Hero's current stats: " + System.lineSeparator() +
                                hero + "\n");
    }
}
