
public class Calculadora implements ICalculadora<Integer>{

	private PilaArray stack;
	
	public Calculadora(){
		stack= new PilaArray();
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
						resultado=suma(Double.parseDouble(stack.pop()),Double.parseDouble(stack.pop()));
						stack.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '-':{//resta
						double b=Double.parseDouble(stack.pop());
						double a=Double.parseDouble(stack.pop());
						resultado=resta(a,b);
						stack.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '*':{//multiplicacion
						resultado=multiplicacion(Double.parseDouble(stack.pop()),Double.parseDouble(stack.pop()));
						stack.push(resultado+"");//ingresa resultado al stack
					break;
				}
				case '/':{//division
						double b=Double.parseDouble(stack.pop());
						double a=Double.parseDouble(stack.pop());
						resultado=division(a,b);
						stack.push(resultado+"");//ingresa resultado al stack
					break;
				}
				}
			}
		}
		return resultado;//resultado final
		
	}



}
