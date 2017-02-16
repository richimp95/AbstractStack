import java.util.ArrayList;


public class PilaArray extends APila{
	
	private ArrayList<String> arreglo; 


	public PilaArray() {
		arreglo = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void push(String item) {//agrega un elemento
		arreglo.add(item);
		
	}

	public String peek() {//muestra el elemento superior
		// TODO Auto-generated method stub
		return arreglo.get(arreglo.size()-1);
	}

	@Override
	public String pop() {//saca un elemento
		String valor =arreglo.get(arreglo.size()-1);
		arreglo.remove(arreglo.size()-1);
		return valor;
	}

	@Override
	public boolean isEmpty() {//muestra si esta vacio
		// TODO Auto-generated method stub
		boolean bandera=true;
		if(arreglo.size()>0){
			
		}else{
			bandera=false;
		}
		return bandera;
	}



}
