package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class FifthExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Locale.setDefault(Locale.US);
	int codFuncionarios;
	int horas;
	double salHora;
	double salario;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual seu numero de funcionario?");
	codFuncionarios = sc.nextInt();
	System.out.println("Quantas horas foram trabalhadas?");
	horas = sc.nextInt(); 
	System.out.println("Qual o valor que você recebe por hora?");
	salHora = sc.nextDouble();
	
	salario = salHora * horas;
	
	System.out.printf("FUNCIONÁRIO = %d \nSALARIO= $%.2f", codFuncionarios, salario);

	}

}
