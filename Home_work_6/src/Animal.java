public abstract class Animal {
    final String name;
    final String animal;
    int hp = 5;
    static boolean death = false;

    public Animal(String name, String animal) {
        this.name = name;
        this.animal = animal;
    }

    public abstract void run();

    void death() {
        System.out.println("Зверь зарычал, упал и умер.");
        death = true;
    }

    int damage(int damage) {
        System.out.println("Зверю нанесли " + damage + " урона.");
        hp = hp - damage;
        if (hp <= 0)
            death();
        else
            hp(hp);
        return (hp);
    }

    void hp(int hp) {
        System.out.println("У зверя осталось " + hp + " очка(ов) жизни.");
    }
}