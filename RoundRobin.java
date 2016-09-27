class RoundRobin{

	Prisoner[] players = new Prisoner[5];
	int pos;
	
	public  void insertPlayer(Prisoner p){
		players[pos] = p;
		pos += 1;
	}

	public void startMatches(int bouts){
		Prisoner player;
		for(int h = 0; h < players.length; h += 1){
			player = players[h];
				for(int g = 0; g < players.length; g += 1){
					if (player != players[g] && players[g].matchesPlayed != players.length - 1){
						PrisDilemma pd = new PrisDilemma(bouts,player, players[g]);
						pd.playGame();
					}
				}
		}
	}

	public void showResults(){
		for(int i = 0; i < players.length; i += 1){
			System.out.println( players[i].strategy + ": " + players[i].totalScore );
		}
	}
}