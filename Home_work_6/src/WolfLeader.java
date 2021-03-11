class WolfLeader extends Wolf implements Leader {
    public WolfLeader(String name, String animal) {
        super(name, animal);
    }


    public int attack() {
        damage = damage + warriorPack * packAttack;
        System.out.println(name + " " + animal + " : Нападает");
        System.out.println("КУСИЩЕ");
        return (damage);
    }

    public int deff(int hit) {
        deff = deff + warriorPack * packDeff;
        System.out.println(name + " " + animal + " : Защищается");
        System.out.println("АГРР");
        hit = hit - deff;
        if (hit < 0)
            hit = 0;
        damage(hit);
        return (hit);
    }

    public boolean lead(int pack) {
        System.out.print(name + " " + animal + " сказал: Теперь я вожак! ");
        if (pack > 1) {
            System.out.println(" Это правда.");
            return (true);
        } else {
            System.out.println(" Если ты вожак, то где твоя стая? Ты не вожак " + name + " " + animal);
            return (false);
        }
    }
}
