class LionMother extends Lion implements Mother {
    public LionMother(String name, String animal) {
        super(name, animal);
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
        System.out.println("ФИТЬ");
        hit = hit - deff;
        if (hit < 0) {
            hit = 0;
        }
        damage(hit);
        return (hit);
    }

    @Override
    void death() {
        System.out.println(name + " " + animal + " : Издала рёв, упала обескровленная и умерла.");
        death = true;
    }
}
