package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
	int idade;
	Scanner leia = new Scanner(System.in);
	System.out.println("digite sua idade : ");
	idade=leia.nextInt();
	if(idade<=14) {
		System.out.println("você faz parte da categoria INFANTIL");
		
	}
	else if(idade<=17) {
		System.out.println("você faz parte da categoria JUVENIL"); 
	}
	else {
		System.out.println("você faz parte da categoria ADULTO");
	}
	}

}
