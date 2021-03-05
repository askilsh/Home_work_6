public interface Leader 
{
	int packAttack = 1;
	int packDeff = 1;

	default int attack(int damage, int pack)
	{
		damage = damage + pack * packAttack;
		System.out.println("КУСИЩЕ");
		return (damage);
	}

	default int deff(int deff, int hit, int pack)
	{
		deff = deff + pack * packDeff;
		System.out.println("АГРР");
		hit= hit - deff;
		if (hit < 0)
			hit = 0;
		return(hit);
	}
}

