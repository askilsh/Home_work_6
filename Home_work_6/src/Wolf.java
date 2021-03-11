public class Wolf extends Animal {
    int damage = 3;
    int deff = 1;
    int hp = 5;
    static int warriorPack = 0;
    static int youngPack = 0;

    public Wolf(String name, String animal) {
        super(name, animal);
    }

    @Override
    int damage(int damage) {
        System.out.println("Волку нанесли " + damage + " урона.");
        hp = hp - damage;
        if (hp <= 0)
            death();
        else
            hp(hp);
        return (hp);
    }

    public void run() {
        System.out.println(name + " " + animal + " : Бежит трусцой");
    }

    public void voice() {
        System.out.println(name + " " + animal + " : Ауууу");
    }

    public static void warriorPack(int warriorPack) {
        System.out.println("В волчьей стае " + warriorPack + " волк(а)(ов)");
    }

    public static void youngPack(int youngPack) {
        System.out.println("У волчьей матери(ей) " + youngPack + " щенок(ка)(ков)");
    }
}

