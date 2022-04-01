package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		double x,y;
		Scanner leia= new Scanner(System.in);
		System.out.println("digite um numero: ");
		x=leia.nextInt();
		if(x%2==0) {
					System.out.println("numero par");
				double raiz=Math.sqrt(x);
				System.out.println("a raiz desse numero é"+raiz);
				}
		else {
			System.out.println("numero impar");
			y=(x*x);
					System.out.println("o numero elevado ao quadrado é: " +y);
		}
		
		
	}

}
