import java.util.Vector;

public class PilaVector extends APila{
	
	private Vector<String> vector;

	public PilaVector() {
		// TODO Auto-generated constructor stub
		vector = new Vector<String>();
	}

	@Override
	public void push(String item) {//agrega un elemento
		// TODO Auto-generated method stub
		vector.addElement(item);
		
	}

	@Override
	public String pop() {//saca un elemento
		// TODO Auto-generated method stub
		String last = vector.get(vector.size()-1);
		vector.remove(vector.size()-1);
		return last;
	}

	@Override
	public boolean isEmpty() {//valida si esta vacio
		// TODO Auto-generated method stub
		boolean bandera=true;
		if(vector.size()>0){
			
		}else{
			bandera=false;
		}
		return bandera;
	}


}
