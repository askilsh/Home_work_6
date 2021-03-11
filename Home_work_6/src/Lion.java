public class Lion extends Animal {
    int damage = 5;
    int deff = 5;
    int hp = 5;
    static int youngPack = 0;

    public Lion(String name, String animal) {
        super(name, animal);
    }

    public void run() {
        System.out.println(name + " " + animal + " : Бежит, рычит");
    }

    public void voice() {
        System.out.println(name + " " + animal + " издает: РЁВ");
    }

    public static void youngPack(int youngPack) {
        System.out.println("У львиц(ы) " + youngPack + " львенка(львят)(львенок)");
    }

    @Override
    int damage(int damage) {
        System.out.println("Льву нанесли " + damage + " урона.");
        hp = hp - damage;
        if (hp <= 0)
            death();
        else
            hp(hp);
        return (hp);
    }
}
