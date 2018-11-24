import java.util.InputMismatchException;
import java.util.Scanner;
public class Inicio {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la Calculadora");
		
		Scanner entrada= new Scanner(System.in);
		boolean salir=false;
		int opcion;
		//realiza accion, mientras no se seleccione opci�n salir
		while(!salir){
			//realiza acci�n mientras no se encuentren errores
			try{
				//muestra el men�
				System.out.print("Elija una opci�n"+"\n"+"	1) Operaciones matem�ticas"+"\n"+
						"	2) Operaciones binarias."+"\n"+"	3) Promedios."+"\n"+
						"	4) Ordenamiento de datos."+"\n"+"	5) Salir"+"\n");
				opcion=entrada.nextInt();
				switch(opcion){
					case 1:
						System.out.println("1) Has seleccionado: Operaciones matem�ticas");
						//se invoca a clase operaciones_matematicas en su m�todo main
						operaciones_matematicas.main(args);
						break;
					case 2:
						System.out.println("2) Has seleccionado: Operaciones binarias");
						break;
					case 3:
						System.out.println("3) Has seleccionado: Promedios");
						break;
					case 4:
						System.out.println("4) Has seleccionado: Ordenamiento de datos");
						break;
					case 5:
						salir = true;
						break;
					default:
						//si el numero seleccionado no esta en el rango de 1 - 5
						System.out.println("Debe seleccionar una opcion entre 1 y 5");
				}
			//si se ingreso un caracter distinto a un n�mero, o surge alg�n error
			} catch (InputMismatchException e) {
			System.out.println("Debe insertar una opci�n entre 1 y 5");
			entrada.next();
			}
		}
		entrada.close();
		System.out.println("Hasta Pronto!!");
		//cierra aplicaci�n
		System.exit(0);
	}
}