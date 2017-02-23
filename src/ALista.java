
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
		
		
}
