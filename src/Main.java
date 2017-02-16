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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner teclado = new Scanner(System.in);
		Calculadora calcular= new Calculadora(n);
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
