package areaquadrilateroretorno;

public class Calculo {
	public static double area(double lado1) {
		return lado1*lado1;
	}
	public static double area(double lado1, double lado2) {
		return lado1*lado2;
	}
	public static double area(double baseMaior, double baseMenor, double altura) {
		return (baseMaior+baseMenor)*altura/2;
	}
	
}
