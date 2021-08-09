/**
 * WILLIANY THALITA ALMEIDA VERAS
 * UFRPE - UAST
 * S.I. - 3º PERIDO, FÍSICA PARA COMPUTAÇÃO
 */

package CalcularAeT;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	  			 								
		Calcular f1 = new Calcular();
		
		System.out.println("______________________________\n\n\tDIGITE OS DADOS\n______________________________");
		
		System.out.println("MASSA DO BLOCO 1...:");
		double m1 = scan.nextDouble();
		f1.setM1(m1);
		
		System.out.println("MASSA DO BLOCO 2...:");
		double m2 = scan.nextDouble();
		f1.setM2(m2);
		
		System.out.println("θ NO BLOCO 1.......:");
		double o1 = scan.nextDouble();
		f1.setO1(o1);		
		
		System.out.println("θ NO BLOCO 2.......:");
		double o2 = scan.nextDouble();
		f1.setO2(o2);		
		
		System.out.println("μe DO BLOCO 1......:");
		double ue1 = scan.nextDouble();
		f1.setUe1(ue1);
				
		System.out.println("μe DO BLOCO 2......:");
		double ue2 = scan.nextDouble();
		f1.setUe2(ue2);
		
		System.out.println("μd DO BLOCO 1......:");
		double ud1 = scan.nextDouble();
		f1.setUd1(ud1);
		
		System.out.println("μd DO BLOCO 2......:");
		double ud2 = scan.nextDouble();
		f1.setUd2(ud2);

		System.out.println("________________________________________\n\n\t\tRESULTADO\n________________________________________\n");
		f1.calcularAceleracaoETensao();
		System.out.println("________________________________________");

	}

}
