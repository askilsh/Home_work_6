public interface Young 
{
	default int attack(int damage)
	{
		System.out.println("кусь");
		return (damage);
	}

	default int deff(int deff, int hit)
	{
		System.out.println("фить");
		hit = hit - deff;
		if (hit < 0)
			hit = 0;
		return(hit);
	}
}
