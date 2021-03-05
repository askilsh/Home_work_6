public class Battle 
{
	public static void start()
	{
		WolfLeader vojak = new WolfLeader("Акела", "Волчара");
		WolfMother mother = new WolfMother("Диана", "Волчица");
		WolfWarrior voin = new WolfWarrior("Клык", "Волчара");
		WolfYoung puppyBoy = new WolfYoung("Громик", "Волчара");
		WolfYoung puppyGirl = new WolfYoung("Принцесса", "Волчара");
		LionWarrior king = new LionWarrior("Муфаса", "Лев");
		LionMother queen = new LionMother("Сараби", "Львица");
		LionYoung cubBoy = new LionYoung("Симба", "Лев");
		LionYoung cubGirl = new LionYoung("Нала", "ЛЬвица");
		int hit;	

		while (Animal.death == false)
		{
			System.out.println();
			Wolf.warriorPack(Wolf.warriorPack);
			Wolf.youngPack(Wolf.youngPack);
			Lion.youngPack(Lion.youngPack);

			vojak.lead(Wolf.warriorPack);
			vojak.voice();
			voin.run();
			queen.run();
			puppyGirl.voice();
			cubGirl.voice();
			hit = king.attack();
			vojak.deff(hit);
			hit  = queen.attack();
			mother.deff(hit);
			hit = cubBoy.attack();
			puppyBoy.deff(hit);
			hit = vojak.attack();
			king.deff(hit);
			hit = mother.attack();
			queen.deff(hit);
			hit = puppyBoy.attack();
			cubBoy.deff(hit);
		}
		System.out.println("Звери посмотрели на погибшего, взгрустнули, и разошлись опечаленные в разные стороны.");
	} 
}
