package EVA2_20_POLIMORFISMO_FIGURAS;

import java.util.Iterator;
import java.util.Scanner;

public class EVA2_20_POLIMORFISMO_FIGURAS {

	public EVA2_20_POLIMORFISMO_FIGURAS() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Circulo C1 = new Circulo(10);
		C1.ImprimirDatos();
		//Figura es padre de circulo
		//Podemo asignar un objeto circulo a una variable Figuras}
		Figuras figu = C1;
		System.out.println("USANDO FIGURAS");
		System.out.println("área: " + figu.CalArea());
		System.out.println("Perimetro: " + figu.CalPerimetro());
		*/
		
		/*int[] arreglo = new int [10]; //arregl qye guarda 10 enteros
		//Un arreglo empieza en 0 y termina en N - 1, N es la cantdad de elementos del arreglo
		arreglo [0] = 100;
		System.out.println(arreglo[0]);*/
		
		System.out.println("¿Cuántas Figuras necesitas?");
		Scanner input = new Scanner(System.in);
		int cant = input.nextInt();
		Figuras[] F1 = new Figuras[cant];
		for (int i = 0; i < F1.length; i++) {
			System.out.println("Que tipo de figura necesitas: [1]Circulo [2]Triangulo ");
			int tipo = input.nextInt();
			if (tipo == 1) {//Circulo
				Circulo C1 = new Circulo();
				System.out.println("Introduce el radio: ");
				C1.setRadio(input.nextDouble());//Capturamos el dato del usuario
				F1[i] = C1;
			}else {//Triangulo
				Triangulo T1 = new Triangulo();
				System.out.println("Introduce la Base: ");
				T1.setBase(input.nextDouble());//Capturamos el dato del usuario
				System.out.println("Introduce la Altura: ");
				T1.setAltura(input.nextDouble());//Capturamos el dato del usuario
				F1[i] = T1;
			}
		}
		
		//Imprimir los Resultados
		for (int i = 0; i < F1.length; i++) {
			if(F1[i] instanceof Circulo) {
			System.out.println("Circulo: " + i);
			//Casting --> Conversion Ejemplo
			//int val (int)Math.random() * 100;
			Circulo C1 =(Circulo)F1[i];
			C1.ImprimirDatos();		
		}else {
			System.out.println("Triangulo: " + i);
			Triangulo T1 = (Triangulo)F1[i];
			System.out.println("Área: " + F1[i].CalArea());
			System.out.println("Perimetro: " + F1[i].CalPerimetro());
		
		/*Circulo[] C1 = new Circulo[cant];
		//C1[0].ImprimirDatos();
		
		for (int i = 0; i < C1.length; i++) {
			C1[0] = new Circulo();
		}
		for (int i = 0; i < C1.length; i++) {
			C1[i].ImprimirDatos();
		}*/
		
			}
		}
	}
}
