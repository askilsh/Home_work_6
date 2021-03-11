class WolfMother extends Wolf implements Mother {
    public WolfMother(String name, String animal) {
        super(name, animal);
        warriorPack++;
    }

    public int attack() {
        damage = damage + youngPack * motherRage;
        System.out.println(name + " " + animal + " : Нападает");
        System.out.println("КУСЬ");
        return (damage);
    }

    public int deff(int hit) {
        deff = deff + youngPack * motherRage;
        System.out.println(name + " " + animal + " : Защищается");
        System.out.println("Зверь испытывает растущую ярость");
        hit = hit - deff;
        if (hit < 0)
            hit = 0;
        damage(hit);
        return (hit);
    }

    @Override
    void death() {
        System.out.println(name + " " + animal + " : Зарычала, упала обессиленная и умерла.");
        warriorPack--;
        death = true;
    }
}
