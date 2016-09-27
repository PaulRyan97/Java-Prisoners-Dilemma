class Soft_Majo extends Strategy{

	int decision;
	String name = "Soft_Majo";
	
	public int tactic(int turn, Prisoner player, Prisoner opponent){
		if (opponent.numCooperates >= (opponent.movesPlayed)/2){
			decision = 0;
		}
		else {
			decision = 1;
		}
		return decision;
	}

	public String toString(){
		return name;
	}
}