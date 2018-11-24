import java.util.InputMismatchException;
import java.util.Scanner;

public class operaciones_binarias {
	private static void binario(){
		Scanner nro= new Scanner(System.in);
		double a,b;
		System.out.println("Ingrese primer número decimal");
		a=nro.nextDouble();
		System.out.println("Ingrese segundo número decimal");
		b=nro.nextDouble();
		
		
		nro.close();
	}
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		boolean salir=false;
		int opcion;
		
		while (!salir){
			try{
				System.out.println("Elija una opción"+"\n"+"	1) Sumar 2 números decimales-binarios"+"\n"+
						"	2) Sumar Hexadecimales"+"\n"+"	3) Cambio de base desde sistema numerico"+"\n"+
						"	4) Transformación de números"+"\n"+"	5) Volver"+"\n");
				opcion=entrada.nextInt();
				switch(opcion){
				case 1: System.out.println("1) Has seleccionado Sumar 2 números decimales-binarios");
						binario();
						break;
				case 5: salir=true;
						break;
				}
			}catch (InputMismatchException e) {
				System.out.println("Debe insertar una opción entre 1 y 5");
				entrada.next();			
			}
		}
		entrada.close();
	}

}
