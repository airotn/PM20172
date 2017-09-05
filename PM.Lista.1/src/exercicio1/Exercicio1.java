package exercicio1;

import java.util.Scanner;

/**
 * 
 * @author Airton Reis
 *
 */
public class Exercicio1 {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in); 
		int lado1, lado2, lado3, somaDe1e2, somaDe2e3, somaDe1e3;
		
		System.out.println("Entre com o primeiro lado do tri�ngulo: ");
		lado1 = scanner.nextInt();
		System.out.println("Entre com o segundo lado do tri�ngulo: ");
		lado2 = scanner.nextInt();
		System.out.println("Entre com o terceiro lado do tri�ngulo: ");
		lado3 = scanner.nextInt();
		
		somaDe1e2 = lado1 + lado2;
		somaDe2e3 = lado2 + lado3;
		somaDe1e3 = lado1 + lado3;
		
		if (lado1 >= somaDe2e3 || lado2 >= somaDe1e3 || lado3 >= somaDe1e2) {
			System.out.println("Seu tri�ngulo � irregular, voc� n�o entrou com dados v�lidos.");
		} else {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Seu tri�ngulo � equil�tero.");
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("Seu tri�ngulo � is�sceles.");
			} else {
				System.out.println("Seu tri�ngulo � escaleno.");
			}
		}
		
	}

}
