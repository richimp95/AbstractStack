
public class SList<E> extends ALista<E> {

	protected Node<E> primero;
	protected int count;
	
	public SList(){
		primero = null;
		count = 0;
	}

	@Override
	public void push(E value) {
	    // location for new value
	      Node<E> temp = new Node<E>(value,null);
	      if (head != null)
	     {
	         // pointer to possible tail
	         Node<E> finger = head;
	         while (finger.next() != null)
	         {
	                finger = finger.next();
	         }
			 
	         finger.setNext(temp);
	      } else head = temp;
		  
		  count++;
		
	}

	@Override
	public E pop() {
        // Declare local variables/objects
        Node<E> antes = null;
        Node<E> despues;
 
 
        // Traverse through the list, getting a reference to the CrunchifyNode before the trailer. Since there is no previous reference.
        antes = antes.next();
 
        for (int coun = 0; coun < count - 2; count++)
            antes = antes.next();
 
        // Save the last CrunchifyNode
        despues = tail;
 
        // Let's do the pointer manipulation
        antes.setNext(null);
        tail = antes;
        count--;
 
        return (E) despues;
	}
	


}
