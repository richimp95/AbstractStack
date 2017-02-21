
public class SList<E> extends ALista<E> {

	
	public void add(E value)
		// TODO Auto-generated method stub
		// post: value is added to beginning of list
	{
	     // note order that things happen:
	     // head is parameter, then assigned
	     head = new Node<E>(value, head);
	     count++;
	}

}
