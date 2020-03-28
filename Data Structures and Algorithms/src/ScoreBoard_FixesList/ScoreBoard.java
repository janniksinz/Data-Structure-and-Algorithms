package ScoreBoard_FixesList;
import java.util.*;

public class ScoreBoard implements List{ //Fixed Size Array
	
	private int numPlayers = 0;
	//Declare Array
	private ScoreBoardEntry[] board;
	private ScoreBoardEntry[] copy_board;
	
	//Constructor
	public ScoreBoard(int arraySize) {
		//initialize Array
		board = new ScoreBoardEntry[arraySize];
	}
	
	 //Interface Functions
	public int size() {
		return numPlayers;
		
	}
	//-------IS-EMPTY-----------
	public boolean isEmpty() {
		if (numPlayers ==0) {
			return true;
		} else {
		return false;
		}
	}
	//----------ADD-------
	public void addElement(int index, ScoreBoardEntry element) {
		if (board.length==numPlayers-1) {
			expandArray(numPlayers);
		} //	end if
		board[index]=element;
		
		
	} //	end ADD
	
	//---------GET---------
	ScoreBoardEntry getElement(int index) {
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
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}




//Expand Array
/*
 * create new array 10 bigger
 * copy old array
 * create old array 10 bigger
 * copy new array into old array
 * 
 * */
