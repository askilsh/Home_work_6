public interface Warrior 
{
	default int attack(int damage)
	{
		System.out.println("КУСЬ");
		return (damage);
	}

	default int deff(int deff, int hit)
	{
		System.out.println("ФИТЬ");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		return(hit);
	}
}
