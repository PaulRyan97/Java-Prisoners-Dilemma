abstract class Prisoner {

	protected int numDefects;
	protected int numCooperates;
	protected int totalScore;
	protected Strategy strategy;
	protected int[] moves;
	protected int prisonerID;
	protected int matchesPlayed;
	protected int movesPlayed;

	
	public Prisoner(int id, Strategy strat) {
		this.strategy = strat;
		this.prisonerID = id;
	}

	public abstract int getDecision(int turn, Prisoner player, Prisoner opponent);

	public String toString(){
		String pris = "";
		pris +=  this.prisonerID + " - " + this.strategy;
		return pris;
	}

}