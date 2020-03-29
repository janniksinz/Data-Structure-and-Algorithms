package ScoreBoard_FixesList;
import java.util.*;

public class ScoreBoard
{ //Fixed Size Array
	
	private int numPlayers = 0;
	//Declare Array
	private ScoreBoardEntry[] board;
	private ScoreBoardEntry[] copy_board;
	
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
	public void addElement(int index, ScoreBoardEntry element)
	{
		if (board.length==numPlayers-1) {
			expandArray(numPlayers);
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
	private void expandArray(int size)
	{
		//new array (+10)
		copy_board = new ScoreBoardEntry[size+10];
		//copy array way 1
		System.arraycopy(board, 0, copy_board, 0, copy_board.length);
		board = new ScoreBoardEntry[copy_board.length];
		board=copy_board.clone();
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
