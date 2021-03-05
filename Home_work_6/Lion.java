public class Lion extends Animal
{
	int damage = 5;
	int deff = 5;
	int hp = 5;
	static int youngPack = 0;
	public Lion(String name, String animal) 
	{
		super(name, animal);
	}

	public void run()
	{
		System.out.println(name + " " + animal + " : Бежит, рычит");
	}

	public void voice()
	{
		System.out.println(name + " " + animal + " издает: РЁВ");
	}

	public static void youngPack(int youngPack)
	{
		System.out.println("У львиц(ы) " + youngPack + " львенка(львят)(львенок)");
	}
	@Override
	int damage(int damage)
	{
		System.out.println("Льву нанесли " + damage + " урона.");
		hp =  hp - damage;
		if (hp <= 0)
			death();
		else
			hp(hp);
		return (hp);
	}
}

class LionWarrior extends Lion implements Warrior
{
	public LionWarrior(String name, String animal) 
	{
		super(name, animal);
	}

	public int attack()
	{
		System.out.println(name + " " + animal + " : Нападает");
		System.out.println("КУСИЩЕ");
		return (damage);
	}

	public int deff(int hit)
	{
		System.out.println(name + " " + animal + " : Защищается");
		System.out.println("ФИТЬ");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		damage(hit);
		return(hit);
	}
}

class LionMother extends Lion implements Mother
{
	public LionMother(String name, String animal) 
	{
		super(name, animal);
	}

	public int attack()
	{
		damage = damage + youngPack * motherRage;
		System.out.println(name + " " + animal + " : Нападает");
		System.out.println("КУСЬ");
		return (damage);
	}

	public int deff(int hit)
	{
		deff = deff + youngPack * motherRage;
		System.out.println(name + " " + animal + " : Защищается");
		System.out.println("ФИТЬ");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		damage(hit);
		return(hit);
	}

	@Override
	void death()
	{
		System.out.println(name + " " + animal + " : Издала рёв, упала обескровленная и умерла.");
		death = true;
	}
}

class LionYoung extends Lion implements Young
{
	int damage = 1;
	int deff = 2;
	int hp = 2;
	public LionYoung(String name, String animal) 
	{
		super(name, animal);
		youngPack++;
	}

	public int attack()
	{
		System.out.println(name + " " + animal + " : Нападает");
		System.out.println("кусь");
		return (damage);
	}

	public int deff(int hit)
	{
		System.out.println(name + " " + animal + " : Защищается");
		System.out.println("фить");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		damage(hit);
		return(hit);
	}

	@Override
	int damage(int damage)
	{
		System.out.println("Львёнку нанесли " + damage + " урона.");
		hp =  hp - damage;
		if (hp <= 0)
			death();
		else
			hp(hp);
		return (hp);
	}

	@Override
	public void voice()
	{
		System.out.println(name + " " + animal + " издает: Мяу");
	}

	@Override
	void death()
	{
		System.out.println(name + " " + animal + " : Мяукнул, упал и умер.");
		youngPack--;
		death = true;
	}

}