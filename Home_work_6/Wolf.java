public class Wolf extends Animal
{
	int damage = 3;
	int deff = 1;
	int hp = 5;
	static int warriorPack = 0;
	static int youngPack = 0;
	public Wolf(String name, String animal) 
	{
		super(name, animal);
	}

	@Override
	int damage(int damage)
	{
		System.out.println("Волку нанесли " + damage + " урона.");
		hp =  hp - damage;
		if (hp <= 0)
			death();
		else
			hp(hp);
		return (hp);
	}

	public void run()
	{
		System.out.println(name + " " + animal + " : Бежит трусцой");
	}

	public void voice()
	{
		System.out.println(name + " " + animal + " : Ауууу");
	}

	public static void warriorPack(int warriorPack)
	{
		System.out.println("В волчьей стае " + warriorPack + " волк(а)(ов)");
	}

	public static void youngPack(int youngPack)
	{
		System.out.println("У волчьей матери(ей) " + youngPack + " щенок(ка)(ков)");
	}
}

class WolfWarrior extends Wolf implements Warrior
{
	public WolfWarrior(String name, String animal) 
	{
		super(name, animal);
		warriorPack++;
	}

	public int attack()
	{
		System.out.println(name + " " + animal + " : Нападает");
		System.out.println("КУСЬ");
		return (damage);
	}

	public int deff(int hit)
	{
		System.out.println(name + " " + animal + " : Защищается");
		System.out.println("ГРРР");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		damage(hit);
		return(hit);
	}

	@Override
	void death()
	{
		System.out.println(name + " " + animal + " : Кинулся с яростью в последний раз, споткнулся и обсилленый упал.");
		warriorPack--;
		death = true;
	}
}

class WolfLeader extends Wolf implements Leader
{
	public WolfLeader(String name, String animal) 
	{
		super(name, animal);
	}

	public int attack()
	{
		damage = damage + warriorPack * packAttack;
		System.out.println(name + " " + animal + " : Нападает");
		System.out.println("КУСИЩЕ");
		return (damage);
	}

	public int deff(int hit)
	{
		deff = deff + warriorPack * packDeff;
		System.out.println(name + " " + animal + " : Защищается");
		System.out.println("АГРР");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		damage(hit);
		return(hit);
	}
	
	public boolean lead(int pack)
	{
		System.out.print(name + " " + animal + " сказал: Теперь я вожак! ");
		if (pack > 1)
		{
			System.out.println(" Это правда.");
			return(true);
		}
			
		else
		{
			System.out.println(" Если ты вожак, то где твоя стая? Ты не вожак " + name + " " + animal);
			return(false);
		}
	}
}

class WolfMother extends Wolf implements Mother
{
	public WolfMother(String name, String animal) 
	{
		super(name, animal);
		warriorPack++;
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
		System.out.println("Зверь испытывает растущую ярость");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		damage(hit);
		return(hit);
	}

	@Override
	void death()
	{
		System.out.println(name + " " + animal + " : Зарычала, упала обессиленная и умерла.");
		warriorPack--;
		death = true;
	}
}

class WolfYoung extends Wolf implements Young
{
	int damage = 1;
	int deff = 1;
	int hp = 2;
	public WolfYoung(String name, String animal) 
	{
		super(name, animal);
		youngPack++;
	}

	public int attack()
	{
		System.out.println(name + " " + animal + " : Нападает");
		System.out.println("кусик");
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
		System.out.println("Волку нанесли " + damage + " урона.");
		hp =  hp - damage;
		if (hp <= 0)
			death();
		else
			hp(hp);
		return (hp);
	}

	@Override
	void death()
	{
		System.out.println(name + " " + animal + " : Заскулил, упал и умер.");
		youngPack--;
		death = true;
	}

	@Override
	public void voice()
	{
		System.out.println(name + " " + animal + " : Скулит");
	}
}