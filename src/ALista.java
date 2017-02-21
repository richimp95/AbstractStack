
public abstract class ALista implements ILista<String>{
		protected String dato;
		protected ILista<String> siguiente;
		protected ILista<String> primero;
		
		public void ILista(){
		        siguiente=null;
		}
		
		public void ILista(String p){
	        siguiente=null;
	        dato = p;
	    }
		
		public boolean estaVacia(){
	        return primero == null;
	    }
		
		public void ILista(String t, ILista<String> siguiente){
	        this.siguiente=siguiente;
	        dato = t;
	    }
		
		public ILista<String> getSiguiente() {
	        return siguiente;
	    }
		
		public void setSiguiente(ILista<String> siguiente) {
	        this.siguiente = siguiente;
	    }
		
		public String getDato() {
	        return dato;
	    }
		
		public int cuantosElementos(){
			ILista<String> aux;
	        int numElementos=0;
	        aux = primero;
	 
	        //Recorremos
	        while(aux != null){
	            numElementos++;
	            aux = aux.getSiguiente();
	        }
	        return numElementos;
	 
	    }
		
		
		
}
