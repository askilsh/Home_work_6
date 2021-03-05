public interface Mother
{
	int motherRage = 1;
	default int attack(int damage, int youngPack)
	{
		damage = damage + youngPack * motherRage;
		System.out.println("КУСЬ");
		return (damage);
	}

	default int deff(int deff, int hit, int youngPack)
	{
		deff = deff + youngPack * motherRage;
		System.out.println("ФИТЬ");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		return(hit);
	}
}
