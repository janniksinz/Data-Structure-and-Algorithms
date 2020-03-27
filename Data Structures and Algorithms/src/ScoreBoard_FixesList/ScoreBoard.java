package ScoreBoard_FixesList;
import java.util.*;

private class ScoreBoardEntry{
	//
	String playerName;
	int score;

	//Constructor
	public ScoreBoardEntry() {
		//TODO
	}
}

public class ScoreBoard{ //Fixed Size Array
	
	private int numPlayers = 0;
	//Declare Array
	private ScoreBoardEntry[] board;
	
	//Constructor
	public ScoreBoard(int arraySize) {
		//initialize Array
		board = new ScoreBoardEntry[arraySize];
	}
	
	//Interface Functions
	int size();
	boolean isEmpty();
	
	void addElement(int index, ScoreBoardEntry element);
	ScoreBoardEntry getElement(int index);
	
}
