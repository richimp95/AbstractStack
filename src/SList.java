
public class SList extends ALista {
	
	@Override
	public void add(int pos, String obj) {
		// TODO Auto-generated method stub
		ILista<String> aux=primero;
        ILista<String> auxDato=null; //Debemos crear un nodo para insetar el dato
        ILista<String> anterior=primero; //Debemos crear un nodo para insetar el dato
         
        int contador=0;
         
        if(pos<0 || pos>cuantosElementos()){
            System.out.println("La posicion insertada no es correcta");
        }else{
             
            if(pos==0){
                insertarPrimero(dato);
            }else if(pos==cuantosElementos()){
                insertarUltimo(dato);
            }else{
                //Recorremos
                while(aux!=null){
                    if (pos == contador){
                        //Creo el nodo
                        auxDato.ILista(dato, aux);
                        //El siguiente del anterior a aux es auxDato
                        anterior.setSiguiente(auxDato);
                    }
                     
                    //Actualizo anterior
                    anterior=aux;
                     
                    contador++;
                    aux=aux.getSiguiente(); //Actualizo siguiente
                }
            }
        }
	}
	
	public void insertarUltimo(String t){
		 
        ILista<String> aux = null;
        aux.ILista(t);
        ILista<String> rec_aux;
 
        if (estaVacia()) {
            insertarPrimero(t);
        }else {
            rec_aux = primero;
             
            //Buscamos el ultimo nodo
            while(rec_aux.getSiguiente() != null){
                rec_aux=rec_aux.getSiguiente();
            } 
                 
            //Actualizamos el siguiente del ultimo
            rec_aux.setSiguiente(aux);
        }
    }
	
	public void insertarPrimero(String t){
        ILista<String> nuevo=null;
        nuevo.ILista(t);
 
        if (!estaVacia()){
            //Sino esta vacia, el primero actual pasa a ser
            // el siguiente de nuestro nuevo nodo
            nuevo.setSiguiente(primero);
        }
         
        //el primero apunta al nodo nuevo
        primero=nuevo;
         
    }
	
	@Override
	public String getFirst() {
		String elemen = null;
        if (!estaVacia()){
            elemen = primero.getDato();
        }
        return  elemen;
	}

}
