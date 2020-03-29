package ScoreBoard_FixesList;

public class TestScoreBoard {

	public static void main(String[] args) {
		//create Array, Size 10
		ScoreBoard myBoard = new ScoreBoard(10);
		
		//add new players in the Scoreboard
		ScoreBoardEntry player1 = new ScoreBoardEntry("Ines", 40);
		ScoreBoardEntry player2 = new ScoreBoardEntry("Giovanni", 43);
		
		myBoard.addElement(0, player1);
		
		//Display
		
	}

}
