import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author helmuthnistal
 *
 */
public class Main {
	
	private static Calculadora calcular;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;//decide el stack a utilizar
		int y = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que desea utilizar? \n 1. Array \n 2. Vector \n 3. Listas");
		n = teclado.nextInt();
		teclado.nextLine();
		while((n != 1) && (n != 2) && (n!= 3)){
			System.out.println("Lo siento! pruebe otra vez");
			System.out.println("Que desea utilizar? \n 1. Array \n 2. Vector \n 3. Listas");
			n = teclado.nextInt();
			teclado.nextLine();
		}
		
		if (n == 1){
			calcular = new Calculadora(n);
			
			System.out.println("Ingrese la direccion del archivo(.txt)");//ingresar direccion del archivo
			String direccion =teclado.nextLine();
			try {
				BufferedReader archivo=new BufferedReader(new FileReader(direccion));//cargar archivo
				try {
					String exprecion= archivo.readLine();//leer linea del archivo
					System.out.println("exprecion encontrada:");
					System.out.println(exprecion);//mostrar linea encontrada
					System.out.println("Resultado:");
					System.out.println(calcular.operar2(exprecion));//mostrar resultado
					archivo.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("archivo vacio");//linea vacia
				}		
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("archivo no encontrado");//no hay archivo
			}
			teclado.close();
			
			
		}else if (n == 2){
			calcular = new Calculadora(n);
			
			System.out.println("Ingrese la direccion del archivo(.txt)");//ingresar direccion del archivo
			String direccion =teclado.nextLine();
			try {
				BufferedReader archivo=new BufferedReader(new FileReader(direccion));//cargar archivo
				try {
					String exprecion= archivo.readLine();//leer linea del archivo
					System.out.println("exprecion encontrada:");
					System.out.println(exprecion);//mostrar linea encontrada
					System.out.println("Resultado:");
					System.out.println(calcular.operar2(exprecion));//mostrar resultado
					archivo.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("archivo vacio");//linea vacia
				}		
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("archivo no encontrado");//no hay archivo
			}
			teclado.close();
			
		}else if(n ==3){
			
			System.out.println("Que tipo de lista desea utilizar \n 1. Doblemente encadenada \n 2. Simplemente encadenada \n 3. lista Circular");
			y = teclado.nextInt();
			teclado.nextLine();
			while((y != 1) && (y != 2) && (y!= 3)){
				System.out.println("Lo siento! pruebe otra vez");
				System.out.println("Que tipo de lista desea utilizar \n 1. Doblemente encadenada \n 2. Simplemente encadenada \n 3. lista Circular");
				y = teclado.nextInt();
				teclado.nextLine();
			}
			
			calcular = new Calculadora(n,y);
			
			System.out.println("Ingrese la direccion del archivo(.txt)");//ingresar direccion del archivo
			String direccion =teclado.nextLine();
			try {
				BufferedReader archivo=new BufferedReader(new FileReader(direccion));//cargar archivo
				try {
					String exprecion= archivo.readLine();//leer linea del archivo
					System.out.println("exprecion encontrada:");
					System.out.println(exprecion);//mostrar linea encontrada
					System.out.println("Resultado:");
					System.out.println(calcular.operar(exprecion));//mostrar resultado
					archivo.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("archivo vacio");//linea vacia
				}		
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("archivo no encontrado");//no hay archivo
			}
			teclado.close();
		}
			
			
		

	}


}
