package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class ThirdExercise {

	public static void main(String[] args) {
		double raio = 0.0, area;
		double pi = Math.PI;
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio para saber a area do seu circulo:");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		
		System.out.printf("A area do circulo com raio %.2f é %.4f!", raio, area);
		
		
		sc.close();
		

	}

}
