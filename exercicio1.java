package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int x,y,z;
		Scanner leia = new Scanner(System.in);
		System.out.println("digite um número: ");
		x=leia.nextInt();
		
		System.out.println("digite outro número: ");
		y=leia.nextInt();
		
		System.out.println("digite outro número: ");
		z=leia.nextInt();
		
		if(x>=y && x>=z){ 
			System.out.println("o maior numero é: "+x);
			
		}
		else if (y>=x && y>=z){
	    	System.out.println("o maior numero é: "+y);
			
		}
	    else {
	    	System.out.println("o maior é o numero:"+z);
	    	
	    }
		
		
		

	}

}
