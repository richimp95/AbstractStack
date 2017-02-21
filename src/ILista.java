
public interface ILista<E> {
	
	public ILista<E> getSiguiente();
	public void add(int index, E obj); //Agrega un objeto a la lista
	public E getFirst(); //Obtiene un objeto de la lista
	public void setSiguiente(ILista<E> siguiente);
	public void ILista(String p);
	public void ILista(String t, ILista<String> siguiente);
	public boolean estaVacia();
	public String getDato();
	
}
