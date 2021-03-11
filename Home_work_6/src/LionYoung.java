class LionYoung extends Lion implements Young {
    int damage = 1;
    int deff = 2;
    int hp = 2;

    public LionYoung(String name, String animal) {
        super(name, animal);
        youngPack++;
    }

    @Override
    public int attack() {
        System.out.println(name + " " + animal + " : Нападает");
        System.out.println("кусь");
        return (damage);
    }

    @Override
    public int deff(int hit) {
        System.out.println(name + " " + animal + " : Защищается");
        System.out.println("фить");
        hit = hit - deff;
        if (hit < 0)
            hit = 0;
        damage(hit);
        return (hit);
    }

    @Override
    int damage(int damage) {
        System.out.println("Львёнку нанесли " + damage + " урона.");
        hp = hp - damage;
        if (hp <= 0)
            death();
        else
            hp(hp);
        return (hp);
    }

    @Override
    public void voice() {
        System.out.println(name + " " + animal + " издает: Мяу");
    }

    @Override
    void death() {
        System.out.println(name + " " + animal + " : Мяукнул, упал и умер.");
        youngPack--;
        death = true;
    }
}
