package areaquadrilateroretorno;

public class Main {

	public static void main(String[] args) {
		double quadrado=Calculo.area(5);
		System.out.println("�rea do quadrado � "+quadrado);
		double quadrilatero=Calculo.area(5, 10);
		System.out.println("�rea do quadril�tero � "+quadrilatero);
		double trapezio=Calculo.area(8, 7, 5);
		System.out.println("�rea do trap�zio � "+trapezio);
	}
	

}
