package listADT;
import java.lang.reflect.*;
import java.util.Arrays;

public class ArrayList<E extends Comparable<? super E>> implements ListADT<E> 
{
	private int size = 0;
	private E[] data;
	private Class<E> type;
	
	public ArrayList(Class<E> type, int array_size)
	{
		this.data = (E[]) Array.newInstance(type, array_size); // needs reflect.array.newInstance method because you can not initialize a generic array in another way.
		this.size = array_size;
		this.type = type;
	}
	
	public int size() {return size;}
	
	public boolean is_empty() {return size==0;}
	
	public E get_element(int index) throws IndexOutOfBoundsException
	{
		if(index > size-1) {throw new IndexOutOfBoundsException();}
		
		return data[index];
	}
	
	public E set_element(int index, E element) throws IndexOutOfBoundsException
	{
		if(index > size-1) {throw new IndexOutOfBoundsException();}
		
		data[index] = element;
		
		return element;
	}
	
	public void add_element(int index, E element) throws IndexOutOfBoundsException 
	{
		//Case index < 0 || i
		if (index < 0 || index > size) throw new IndexOutOfBoundsException();
		
		//Case index equals size 
		if (index == size) 
		{
			E[] temp_array = (E[]) Array.newInstance(type, size+1);
						
			//copy cells 0 - size-1 from data to temp_array
			System.arraycopy(data, 0, temp_array, 0, size);
			
			temp_array[size] = element;
			
			this.data = temp_array;
			this.size++;
		}
		
		//Case cell is empty
		else if (this.data[index] == null) this.data[index] = element;
		
		//Case index is lower than size and last element is empty
		else if (this.data[size-1] == null)
		{
			E[] temp_array = (E[]) Array.newInstance(type, size);
			
			//copy until index
			System.arraycopy(data, 0, temp_array, 0, index-1);
			//write at index
			temp_array[index] = element;
			//copy after index
			System.arraycopy(data, index, temp_array, index+1, size-index);
			
			this.data = temp_array;
		}
		
		//Case index is lower than size and last element is not empty
		else if (this.data[size-1] != null)
		{
			E[] temp_array = (E[]) Array.newInstance(type, size+1);
			
			//copy until index
			System.arraycopy(data, 0, temp_array, 0, index);
			//write at index
			temp_array[index] = element;
			//copy after index
			System.arraycopy(data, index, temp_array, index+1, size-index);
			
			this.data = temp_array;
			this.size++;
		}
	}

	public E remove_element(int index) throws IndexOutOfBoundsException, NullPointerException
	{
		//if cell at index equals null: throw NullPointer
		if (this.data[index] == null) throw new NullPointerException();
		
		//if index out of bounds: throw IndexOutOfBounds
		if (index < 0 || index > this.size) throw new IndexOutOfBoundsException();
		
		//initializer Array, 1 smaller
		E[] temp_array = (E[]) Array.newInstance(this.type, this.size-1);
		
		//Element at index (to be removed)
		E element_removed = data[index];
		
		//Case remove last element
		if (index == this.size-1) 
		{
			for(int i = 0; i<=size-2; i++) temp_array[i] = this.data[i];
			
			//copy until index
			System.arraycopy(data, 0, temp_array, 0, index-1);
			
			this.data = temp_array;
		}
		
		else if (index == 0) 
		{
			System.arraycopy(data, 1, temp_array, 0, size-1);
			this.data = temp_array;
		}
		
		//Case remove any other element
		else 
		{
			//copy until index
			System.arraycopy(data, 0, temp_array, 0, index);

			//copy after index
			System.arraycopy(data, index+1, temp_array, index, size-index-1);
			
			this.data = temp_array;
		}
		
		this.size--;
		return element_removed;
	}

	public String toString() 
	{
		String print_statement = "";
		
		for(E element : data)
		{
			if (element == null) 
			{
				print_statement += "\nnull";
			}
			else print_statement += "\n" + element.toString();
		}
	
		return print_statement;
	}
}
