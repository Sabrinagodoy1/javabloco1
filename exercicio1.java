package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int x,y,z;
		Scanner leia = new Scanner(System.in);
		System.out.println("digite um n�mero: ");
		x=leia.nextInt();
		
		System.out.println("digite outro n�mero: ");
		y=leia.nextInt();
		
		System.out.println("digite outro n�mero: ");
		z=leia.nextInt();
		
		if(x>=y && x>=z){ 
			System.out.println("o maior numero �: "+x);
			
		}
		else if (y>=x && y>=z){
	    	System.out.println("o maior numero �: "+y);
			
		}
	    else {
	    	System.out.println("o maior � o numero:"+z);
	    	
	    }
		
		
		

	}

}
