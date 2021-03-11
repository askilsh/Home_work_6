class WolfYoung extends Wolf implements Young {
    int damage = 1;
    int deff = 1;
    int hp = 2;

    WolfYoung(final String name, final String animal) {
        super(name, animal);
        youngPack++;
    }

    public int attack() {
        System.out.println(name + " " + animal + " : Нападает");
        System.out.println("кусик");
        return (damage);
    }

    public int deff(int hit) {
        System.out.println(name + " " + animal + " : Защищается");
        System.out.println("фить");
        hit = hit - deff;
        if (hit < 0) {
            hit = 0;
        }
        damage(hit);
        return (hit);
    }

    @Override
    int damage(final int damage) {
        System.out.println("Волку нанесли " + damage + " урона.");
        hp = hp - damage;
        if (hp <= 0) {
            death();
        } else {
            hp(hp);
        }
        return (hp);
    }

    @Override
    void death() {
        System.out.println(name + " " + animal + " : Заскулил, упал и умер.");
        youngPack--;
        death = true;
    }

    @Override
    public void voice() {
        System.out.println(name + " " + animal + " : Скулит");
    }
}