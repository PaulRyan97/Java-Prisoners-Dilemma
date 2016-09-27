import java.util.Random;

class Rand extends Strategy{

	Random option = new Random();
	String name = "Rand";

	
	public int tactic(int turn, Prisoner player, Prisoner opponent){
		int decision = option.nextInt(2);
		return decision;
	}

	public String toString(){
		return name;
	}
}