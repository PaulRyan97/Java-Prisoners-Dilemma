class PrisDilemma{

	Prisoner player1;
	Prisoner player2;
	Prisoner[] players = new Prisoner[2];
	Strategy[] strategies;
	int numBouts;

	public PrisDilemma( int bouts, Prisoner p1, Prisoner p2){
		this.numBouts = bouts;
		player1 = p1;
		player2 = p2;
		players[0] = player1;
		players[1] = player2;
		for (int i = 0; i < players.length; i += 1){
			players[i].moves = new int[numBouts];
		}
		
	}
	

	public void calculateScore(int s1, int s2, Prisoner p1, Prisoner p2){
		int points1;
		int points2;
		if (s1 == s2){
			if (s1 == 0){
				points1 = 3;
				points2 = 3;
			}
			else{
				points1 = 1;
				points2 = 1;
			}
		}
		else{
			if (s1 == 0){
				points1 = 0;
				points2 = 5;
			}
			else{
				points1 = 5;
				points2 = 0;
			}

		}
		p1.totalScore += points1;
		p2.totalScore += points2;
	}

	public void playGame( ){
		for(int i = 0; i < numBouts; i += 1){
			for(int h =0; h < players.length; h += 1){
				int g = 0;
				if ( h == 0){
					g = h + 1;
				}
				players[h].movesPlayed += 1;
	
				players[h].getDecision(i, players[h], players[g]);
			}
			calculateScore( player1.moves[i], player2.moves[i], player1 ,player2);

		}
		for (int j = 0; j < players.length; j += 1){
			players[j].matchesPlayed += 1;
		}

		for(int o = 0; o < players.length; o += 1){
			players[o].numCooperates = 0;
			players[o].numDefects = 0;
			players[o].movesPlayed = 0;
		}

	}
			
}