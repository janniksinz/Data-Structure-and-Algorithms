package listADT;
import java.lang.reflect.*;

public class ArrayList<E extends Comparable<? super E>> implements ListADT<E> {
	
	private int size = 0;
	private E[] data;
	
	//Constructor
	public ArrayList(Class<E> type, int arraySize) {
		data = (E[])Array.newInstance(type, arraySize);
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

} //	end of class ArrayList<>
