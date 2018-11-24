import java.util.InputMismatchException;
import java.util.Scanner;

public class operaciones_matematicas {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		boolean salir=false;
		int opcion;
		//realiza accion, mientras no se seleccione opción salir
		while (!salir){
			//realiza acción mientras no se encuentren errores
			try{
				System.out.print("Elija una opción"+"\n"+"	1) Sumar 2 elementos"+"\n"+
						"	2) Restar 2 elementos"+"\n"+"	3) Dividir 2 elementos"+"\n"+
						"	4) Multiplicar 2 elementos"+"\n"+"	5) Volver"+"\n");
				opcion=entrada.nextInt();
				switch(opcion){
				
				case 5:salir=true;
						break;
				}
				
			//si se ingreso un caracter distinto a un número, o surge algún error
			}catch (InputMismatchException e) {
				System.out.println("Debe insertar una opción entre 1 y 5");
				entrada.next();			
			}
			
		}
		entrada.close();
	}
}
