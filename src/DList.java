
public class DList<E> extends ALista<E>  {
	protected DoublyLinkedNode<E> primero;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;

	public DList()
	// post: constructs an empty list
	{
	   head = null;
	   tail = null;
	   count = 0;
	}
	

	@Override
	public void push(E valor){
		// pre: value is not null
		// post: adds new value to tail of list
		
		   // construct new element
		   tail = new DoublyLinkedNode<E>(valor, null, tail);
		   // fix up head
		   if (head == null) head = tail;
		   count++;
		
    }


	@Override
	public E pop() {
		   DoublyLinkedNode<E> temp = tail;
		   tail = tail.previous();
		   if (tail == null) {
		       head = null;
		   } else {
		       tail.setNext(null);
		   }
		   count--;
		   return temp.value();
	} 
	
	
	
	
}