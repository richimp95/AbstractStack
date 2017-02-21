
public abstract class ALista<E> implements ILista<E>{
	protected int count;
	protected Node<E> head; // ref. to first element
	protected Node<E> tail; 
	
	public ALista()
	   // post: does nothing
	   {
			tail = null;
			count = 0;
			head =null;
	   }
	public int size()
	   // post: returns number of elements in list
	  {
	    return count;
	  }
	public E getFirst() {
			// TODO Auto-generated method stub
			E aux= head.value();
			return aux;
	}
	public E removeFirst()  
	// pre: list is not empty
	// post: removes and returns value from beginning of list
	{
	     Node<E> temp = head;
	     head = head.next(); // move head down list
	     count--;
	     return temp.value();
	}
		
		
}
