class RoundRobinTester{
	
	public static void main(String[] args){
	Prisoner[] players = new Prisoner[5];

	players[0] = new Turn(1, new Rand());
	players[1] = new Turn(2, new Nice_Tit_For_Tat());
	players[2] = new Turn(3, new Nasty_Tit_For_Tat());
	players[3]= new Turn(4, new Soft_Majo());
	players[4] = new Turn(5, new Hard_Majo());

	RoundRobin rr = new RoundRobin();
	for(int i = 0; i < players.length; i += 1){
		rr.insertPlayer(players[i]);
	}
	rr.startMatches(200);
	rr.showResults();
	

	

}

}