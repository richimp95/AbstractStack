
public interface ILista<E> {
	public int size();
	public void add(E value);
	   // post: value is added to tail of list
	public E getFirst();
	   // pre: list is not empty
	   // post: returns first value in list

	public E removeFirst();
	   // pre: list is not empty
	   // post: removes first value from list
}
