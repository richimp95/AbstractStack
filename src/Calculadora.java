
public class Calculadora implements ICalculadora<Integer>{

	private ILista<String> stack;
	private IPila<String> stack2;

	public Calculadora(int n){
		//n decide que tipo de pila utilizar
		FactoryPila pila=new FactoryPila(); //Se le pide al Factory que elija el tipo de pila
		stack2=pila.getPila(n);
	}
	
	public Calculadora(int x, int y){
		FactoryLista lista = new FactoryLista();
		stack = lista.getLista(x);
	}

	@Override
	public double suma(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double resta(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicacion(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double division(double a, double b) {
		// TODO Auto-generated method stub
		return (double) a/b;
	}

	
	public double operar(String postfix){
		String numeros="0123456789";
		String operandos="+-*/";
		double resultado=0;
	
		for(int i=0;i<postfix.length();i++){//recorre toda la exprecion analizando cada char
			if(numeros.indexOf(postfix.charAt(i))>=0){//si es numero
				stack.push(postfix.charAt(i)+"");
			}else if(operandos.indexOf(postfix.charAt(i))>=0){//si es operador
				switch(postfix.charAt(i)){
				case '+':{//suma
						double b = Double.parseDouble(stack.pop()+"");
						double c = Double.parseDouble(stack.pop()+"");
						resultado=suma(b,c);
						stack.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '-':{//resta
						double b=Double.parseDouble(stack.pop()+"");
						double a=Double.parseDouble(stack.pop()+"");
						resultado=resta(a,b);
						stack.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '*':{//multiplicacion
						double b = Double.parseDouble(stack.pop()+"");
						double c = Double.parseDouble(stack.pop()+"");
						resultado=multiplicacion(b,c);
						stack.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '/':{//division
						double b=Double.parseDouble(stack.pop()+"");
						double a=Double.parseDouble(stack.pop()+"");
						resultado=division(a,b);
						stack.push(resultado+"");//ingresa resultado al stack
					break;
				}
				}
			}
		}
		
		return resultado;//resultado final
		
	}

	public double operar2(String postfix){
		String numeros="0123456789";
		String operandos="+-*/";
		double resultado=0;
	
		for(int i=0;i<postfix.length();i++){//recorre toda la exprecion analizando cada char
			if(numeros.indexOf(postfix.charAt(i))>=0){//si es numero
				stack2.push(postfix.charAt(i)+"");
			}else if(operandos.indexOf(postfix.charAt(i))>=0){//si es operador
				switch(postfix.charAt(i)){
				case '+':{//suma
						resultado=suma(Double.parseDouble(stack2.pop()+""),Double.parseDouble(stack2.pop()+""));
						stack2.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '-':{//resta
						double b=Double.parseDouble(stack2.pop()+"");
						double a=Double.parseDouble(stack2.pop()+"");
						resultado=resta(a,b);
						stack2.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '*':{//multiplicacion
						resultado=multiplicacion(Double.parseDouble(stack2.pop()+""),Double.parseDouble(stack2.pop()+""));
						stack2.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '/':{//division
						double b=Double.parseDouble(stack2.pop()+"");
						double a=Double.parseDouble(stack2.pop()+"");
						resultado=division(a,b);
						stack2.push(resultado+"");//ingresa resultado al stack
					break;
				}
				}
			}
		}
		
		return resultado;//resultado final
		
	}


}
