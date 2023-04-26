package application;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media, soma;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		soma = 0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		media = soma/ n;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f", media );
		
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA:  ");
		for(int i=0; i<n; i++) {
			if(vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();

	}

}
