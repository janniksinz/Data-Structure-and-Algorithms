import java.util.LinkedList;

public class SingleLinkedList<E extends Comparable<? super E>> implements ListADT<E>
{
    private Node<E> head;
    private int size = 0;
    private Class<E> type;

    //  constructor
    public SingleLinkedList(Class<E> type)
    {
        this.type = type;
    }

    public void addFirst(E element)
    {
        Node<E> entry = new Node<>(element);
        head = entry;
        size++;
    }

    //add element at given position
    public void addElement(int pos, E element)
    {
        // validate pos not negative || > size

        //addFirst
        if (size==0)
        {
            addFirst(element);
        } else {
            //  iterate through list to pos
            Node<E> currentNode = head;
            int currentPos = 0;
            while (currentNode.next()!=null && currentPos != pos)
            {
                currentNode = currentNode.next();
                currentPos++;
            }
            //  add element
            Node<E> entry = new Node<>(element);
            currentNode.setNext(entry);
            size++;


        }
        //update head, tail, size
        size++;
    }
    //to be implemented

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "head=" + head +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}
