public class Node<E>
{
   protected E data; // value stored in this element
	private Node<E> primero;
	private Node<E> siguiente;

   public Node(E v, Node<E> next)
   // pre: v is a value, next is a reference to 
   //      remainder of list
   // post: an element is constructed as the new 
   //      head of list
   {
       data = v;
       siguiente = next;
   }

   public Node(E v)
   // post: constructs a new tail of a list with value v
   {
      this(v,null);
   }

   
   public Node<E> next()
   // post: returns reference to next value in list
   {
      return siguiente;
   }

   public void setNext(Node<E> next)
   // post: sets reference to new next value
   {
      siguiente = next;
   }

   
   public E value() {
       return data;
   }
}