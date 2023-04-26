package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int nPares;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int vect[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		nPares = 0;
		for(int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				nPares++;
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + nPares);
		
		sc.close();
	}

}
