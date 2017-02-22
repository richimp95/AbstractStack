
public class ListPila<E> extends APila{
	int n=0;
	FactoryLista fact=new FactoryLista();
	ALista<E> list = (ALista<E>) fact.getLista(n);
	
	public String pop() {
		ALista<E> aux = list;
		list.getFirst();
		list.removeFirst();
		return (String) aux.getFirst();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (list.size()==0)
			return true;
		else
			return false;
	}

	public void push(String item) {
		list.add((E) item);
		
	}

}
