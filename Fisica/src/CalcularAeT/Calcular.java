package CalcularAeT;

public class Calcular {
	//ATRIBUTOS
	private double m1,m2,o1,o2;
	private double ue1,ue2,ud1,ud2;
	public double g;
	private double a,t;
	private double p1x,p2x,fate1,fatd1,fate2,fatd2;

	//MÉTODO CONSTRUTOR
	public Calcular() {
		this.g = 9.8;
	}

	//MÉTODO ESPECIAL
	public void calcularAceleracaoETensao(){

		p1x = m1 * g * Math.sin(Math.toRadians(o1));
		p2x = m2 * g * Math.sin(Math.toRadians(o2));	
		System.out.println("P1x........: " + p1x + " N");
		System.out.println("P2x........: " + p2x + " N");

		fate1 = m1 * g * Math.cos(Math.toRadians(o1)) * ue1;
		fate2 = m2 * g * Math.cos(Math.toRadians(o2) * ue2);
		fatd1 = m1 * g * Math.cos(Math.toRadians(o1)) * ud1;
		fatd2 = m2 * g * Math.cos(Math.toRadians(o2)) * ud2;

		if(p1x < p2x){
			if(p2x - (fate1 + fate2 + p1x) == 0){
				System.out.println("OS BLOCOS NÃO ESTÃO EM MOVIMENTO");
			} else {
				a = (p2x - (fatd1 + fatd2 + p1x)) / (m1 + m2);
				t = ( -m2 * a ) - fatd2 + p2x;
				
				System.out.println("ACELERAÇÃO.: " + a + " m/s²");
				System.out.println("TENSÃO.....: " + t + " N");
			}
		} else {
			if(p1x - (fate1 + fate2 + p2x) == 0){
				System.out.println("OS BLOCOS NÃO ESTÃO EM MOVIMENTO");
			}else {
				a = (p1x - (fatd1 + fatd2 + p2x)) / (m1 + m2);
				t = (-m1 * a) - fatd1 + p1x;

				System.out.println("ACELERAÇÃO.: " + a + " m/s²");
				System.out.println("TENSÃO.....: " + t + " N");
			}
		}
	}

	//MÉTODOS ACESSORES
	
	public void setM1(double m1) {
		this.m1 = m1;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public void setO1(double o1) {
		this.o1 = o1;
	}

	public void setO2(double o2) {
		this.o2 = o2;
	}

	public void setUe1(double ue1) {
		this.ue1 = ue1;
	}

	public void setUe2(double ue2) {
		this.ue2 = ue2;
	}

	public void setUd1(double ud1) {
		this.ud1 = ud1;
	}

	public void setUd2(double ud2) {
		this.ud2 = ud2;
	}
}
