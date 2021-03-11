class LionWarrior extends Lion implements Warrior {
    public LionWarrior(String name, String animal) {
        super(name, animal);
    }

    @Override
    public int attack() {
        System.out.println(name + " " + animal + " : Нападает");
        System.out.println("КУСИЩЕ");
        return (damage);
    }

    @Override
    public int deff(int hit) {
        System.out.println(name + " " + animal + " : Защищается");
        System.out.println("ФИТЬ");
        hit = hit - deff;
        if (hit < 0)
            hit = 0;
        damage(hit);
        return (hit);
    }
}
