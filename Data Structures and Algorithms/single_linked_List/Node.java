public class Node<E extends Comparable<? super E>>
{
    //variables
    private E data;
    private Node<E> next;

    public Node (E element)
    {
        this.data = element;
        next = null;
    }

    //getter NextNode
    public Node<E> next()
    {
        return this.next;
    }

    //getter Data
    public E getData()
    {
        return this.data;
    }

    //setter Data
    public void setData(E newElement)
    {
        this.data = newElement;
    }
    //setter nextNode
    public void setNext(Node<E> nextNode)
    {
        this.next = nextNode;
    }


}
