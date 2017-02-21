
public class DList<E> extends ALista<E>  {
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;

	public DList()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}
	
	public void add(E value)
	// pre: value is not null
	// post: adds element to head of list
	{
	   // construct a new element, making it head
	   head = new DoublyLinkedNode<E>(value, head, null);
	   // fix tail, if necessary
	   if (tail == null) tail = head;
	   count++;
	}
	
}