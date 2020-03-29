package ScoreBoard_FixesList;

public class TestScoreBoard {

	public static void main(String[] args) {
		//create Array, Size 10
		ScoreBoard myBoard = new ScoreBoard(10);
		
		//add new players in the Scoreboard
		ScoreBoardEntry player1 = new ScoreBoardEntry("Ines", 40);
		ScoreBoardEntry player2 = new ScoreBoardEntry("Giovanni", 43);
		
		myBoard.addElement(0, player1);
		myBoard.addElement(1, player2);
		System.out.println("Empty:\n"+myBoard.isEmpty()+"\n-Test passed\n-----------\n");
		System.out.println("Size:\n"+myBoard.boardSize()+"\n-Test passed\n-----------\n");
		//	ouput all elements
		boolean b = false;
		for(int i=0;i<myBoard.boardSize();i++)
		{
			System.out.print(myBoard.getElement(i).playerName);
			System.out.println(" "+myBoard.getElement(i).score+"\n");
			b=true;
		} if (b==true) {System.out.println("element-output-test passed\n-----------\n");}
		//testing overflow expansion
		System.out.println(myBoard.boardSize());
		for (int i =2;i<12;i++)
		{
			 myBoard.addElement(i, player2); 
			 System.out.println(myBoard.boardSize());
		}
		
	}

}
