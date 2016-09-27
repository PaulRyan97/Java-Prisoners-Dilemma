class Turn extends Prisoner{
	
	Strategy strat;

	public Turn(int id, Strategy strat){
		super(id ,strat);
		this.strat = strat;
	}

	public int getDecision(int turn, Prisoner player, Prisoner opponent){
		int move = this.strat.tactic(turn, player, opponent);
		player.moves[turn] = move;
		if (move == 0){
			numCooperates += 1;
		}
		else{
			numDefects += 1;
		}
		return move;

	}

}