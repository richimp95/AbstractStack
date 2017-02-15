import java.util.Vector;

public class PilaVector implements IPila<String>{
	
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
		return vector.get(vector.size()-1);
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
