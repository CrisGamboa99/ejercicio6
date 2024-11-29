package org.generation.codigo6;

//Se importa la libreria para el scanner
import java.util.Scanner;

public class Codigo6 {
	  
	public static void main(String[] args) {
    
		// Se añade un scanner
		Scanner sc = new Scanner(System.in);
		
		// Se añade new para crear correctamente el arreglo
		int[] n = new int[20];

		// Se ñade un + a i para que se incremente correctamente
    
		for (int i = 0; i < 20; i++) {
			n[i] = (int)(Math.random() * 381) + 20;
			// Se añade .out para imprimir correctamente
			System.out.print(n[i] + " ");
		}
    
		// Se corrige printl por println
		System.out.println("\n¿Qué números quiere resaltar? ");
		System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		// para cambiar la cadena de texto ingresada por el usuario a int
		int opcion = Integer.parseInt(sc.nextLine());

		// Se invierten : y ? para el correcto funcionamiento del operador ternario
		int multiplo = (opcion == 1) ? 5 : 7;

		// Se borra each de foreach y se cambia el tipo de dato de e de char a int para concordar con el arreglo
		for (int e : n) {
			if (e % multiplo == 0) {
				System.out.print("[" + e + "] ");
			// Se cierra el if con }
			} else {
				//Se cambia in por out
				System.out.print(e + " ");
			}
		}
	}
}