package exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner leia= new Scanner(System.in);
		System.out.println("digite o numero que você deseja");
		a=leia.nextInt();
		System.out.println("digite o numero que você deseja");
		b=leia.nextInt();
		System.out.println("digite o numero que você deseja");
		c=leia.nextInt();
		
		if(a>=b && b>=c) {
			System.out.println("na forma crescente fica assim: " +c+"-"+b+"-"+a);
			
		}else if(b>=a && b>c && a>=c){
			System.out.println("na forma crescente fica: "+c+"-"+a+"-"+b);
		}
		else if(b>a && b>=c && a<c) {
			System.out.println("na forma crscente fica: "+a+"-"+c+"-"+b);
		}
		else if(b>a &&b<=c) {
			System.out.println("na forma crescente fica: "+a+"-"+b+"-"+c);
		}
		else if(b<a && a<c) {
			System.out.println("na forma crescente fica: "+b+"-"+a+"-"+c);
			}
		else if(b<c && c<=a) {
			System.out.println("na forma crescente fica: "+b+"-"+c+"-"+a);
		}
		

	}

}
