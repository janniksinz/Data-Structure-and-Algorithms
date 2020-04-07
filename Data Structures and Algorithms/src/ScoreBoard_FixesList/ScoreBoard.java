package ScoreBoard_FixesList;
import java.util.*;

public class ScoreBoard
{ //Fixed Size Array
	
	private int numPlayers = 0;
	//Declare Array
	private ScoreBoardEntry[] board;
	private ScoreBoard[] copy_board;
	
	//Constructor
	public ScoreBoard(int arraySize)
	{
		//initialize Array
		board = new ScoreBoardEntry[arraySize];
	}
	
	 //Interface Functions
	public int size()
	{
		return numPlayers;
	}
	
	public int boardSize()
	{
		return numPlayers;
	}
	
	//-------IS-EMPTY-----------
	public boolean isEmpty()
	{
		if (numPlayers ==0) {
			return true;
		} else {
		return false;
		}
	}
	//----------ADD-------
	public void addElement(int index, ScoreBoardEntry element, ScoreBoard[] myBoard)
	{
		if (numPlayers==myBoard.length) {
			expandArray(numPlayers, myBoard);
		} //	end if
		board[index]=element;
		numPlayers+=1;
	} //	end ADD
	
	//---------GET---------
	ScoreBoardEntry getElement(int index)
	{
		return board[index];
	} //	end GET
	
	
	//---------EXPAND---------
	private ScoreBoard[] expandArray(int size, ScoreBoard[] myBoard)
	{
		System.out.println("expand function called");
		//new array (+10)
		copy_board = new ScoreBoard[board.length+10];
		//copy array way 1
		System.arraycopy(board, 0, copy_board, 0, copy_board.length);
		myBoard = new ScoreBoard[copy_board.length];
		myBoard=copy_board.clone();
		return myBoard;
	} //	end EXPAND

	
	//-----------------------------------------------
	//-----------------------------------------------
	//-----------------------------------------------
	
	
	
}




//Expand Array
/*
 * create new array 10 bigger
 * copy old array
 * create old array 10 bigger
 * copy new array into old array
 * 
 * */
