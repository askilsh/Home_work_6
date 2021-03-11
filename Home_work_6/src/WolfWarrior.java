class WolfWarrior extends Wolf implements Warrior {
    public WolfWarrior(String name, String animal) {
        super(name, animal);
        warriorPack++;
    }

    public int attack() {
        System.out.println(name + " " + animal + " : Нападает");
        System.out.println("КУСЬ");
        return (damage);
    }

    public int deff(int hit) {
        System.out.println(name + " " + animal + " : Защищается");
        System.out.println("ГРРР");
        hit = hit - deff;
        if (hit < 0)
            hit = 0;
        damage(hit);
        return (hit);
    }

    @Override
    void death() {
        System.out.println(name + " " + animal + " : Кинулся с яростью в последний раз, споткнулся и обсилленый упал.");
        warriorPack--;
        death = true;
    }
}
