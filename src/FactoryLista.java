
public class FactoryLista{
	public ILista<String> getLista(int n){
		//Dependiendo del n se devolverá la lista seleccionada
		if(n==1)
			return new DList<String>();
		else if(n==2)
			return new SList<String>();
		else if(n==3)
			return new CList<String>();
		else
			return null;
	}
}
