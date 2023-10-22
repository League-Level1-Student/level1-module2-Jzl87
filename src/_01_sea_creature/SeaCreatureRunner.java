package _01_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		
		SeaCreature spongeBob = new SeaCreature("sponge bob");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		
		spongeBob.eat();
		spongeBob.laugh();
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}
}

//      3:17.72 NEW WORLD RECORD!!!!
