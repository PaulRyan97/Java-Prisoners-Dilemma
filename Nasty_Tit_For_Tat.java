class Nasty_Tit_For_Tat extends Strategy{
	
	int decision;
	String name = "Nasty_Tit_For_Tat";
	
	public int tactic(int turn, Prisoner player, Prisoner opponent){
		if (turn == 0){
			decision = 1;
		}
		else{
			decision = opponent.moves[turn - 1];
		}
		return decision;
	}

	public String toString(){
		return name;
	}

}