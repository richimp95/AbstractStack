
public interface IPila<E>{
		
   public void push(E algo);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public boolean isEmpty();
   // post: returns true if and only if the stack is empty
   


}