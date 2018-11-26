package calculadora;

import java.util.Scanner;
import java.util.InputMismatchException;
public class ordenamiento_de_datos {

	public static void main (String []args) {
		//El siguiente código permite ordenar una serie de números "N" según determine el usuario.
		Scanner entrada=new Scanner(System.in);
		int N = 0;
		int M=0;
		int i;
		int j;
		int aux;
		boolean salir=false;
	
		System.out.println("Ingrese total de datos a leer: ");//Aquí determinamos la cantidad de datos a ordenar
		N=entrada.nextInt();
		int arreglo[]=new int[N];
			for(i=0; i<N; i++){
				System.out.print("X[" +(i+1)+ "] = " );
				arreglo[i]=entrada.nextInt();
			}
			while(!salir){
				try{
					System.out.print("¿Cómo desea ordenar?: " + "\n" + "(1) Ascendente " + "\n" + "(2) Descendente"+ "\n");
					M=entrada.nextInt();
					if(M==1){  //Aquí determinamos si es de manera ascendente el ordenamiento
						for(i=0; i<N; i++){
							for(j=i+1; j<N; j++){
								if(arreglo[i]>arreglo[j]){
									aux=arreglo[i];
									arreglo[i]=arreglo[j];
									arreglo[j]=aux;
								}	
							}
						}
							System.out.print("Arreglo {");
								for(i=0; i<N; i++){
									System.out.print(arreglo[i] + " , ");
								}
								System.out.print("}");	
								salir=true;
					}
					else{
						if(M==2){ //Aquí determinamos si es de manera descendente el ordenamiento
							for(i=0; i<N; i++){
								for(j=i+1; j<N; j++){
									if(arreglo[i]<arreglo[j]){
										aux=arreglo[i];
										arreglo[i]=arreglo[j];
										arreglo[j]=aux;
				
									}	
								}
							}
								System.out.print("Arreglo {");
									for(i=0; i<N; i++){
										System.out.print(arreglo[i] + " , ");
									}
									System.out.print("}");	
									salir=true;
						}
						else{
							System.out.println("ingrese opción valida" ); // Permite retornar nuevamente a la pregunta de como ordenar los datos en caso de ingresar una opción incorrecta
	
						}
					}
				}
				catch (InputMismatchException e) { // Permite retornar nuevamente a la pregunta de como ordenar los datos en caso de ingresar un símbolo
					System.out.println("Ingrese opción válida");
					entrada.next();
				}
			}
	}
}
