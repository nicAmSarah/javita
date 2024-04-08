package curso_programacao;

import java.util.Locale;

public class FirstExercise {

	public static void main(String[] args) {

		//marcadores de variaveis
	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 30;
	int cod = 5203;
	char gender ='F';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234;
	
	System.out.printf("Products: %n %s, which price is $%.2f%n %s,which price is $%.2f%n Record: %d years old, code %d and gender: %c %n Measue whith none decimal places: %.9f %n Rouded (three decimal places) %.3f %n" , product1, price1, product2, price2, age, cod, gender, measure, measure);
	Locale.setDefault(Locale.US);
	System.out.printf("US decimal point: %.3f", measure);
	}

}
