
public class FactoryPila{
	public IPila<String> getPila(int n){
		//Dependiendo del n se devolverá la pila seleccionada
		if(n==1)
			return new PilaArray();
		else if(n==2)
			return new PilaVector();
		else
			return null;
	}
}
