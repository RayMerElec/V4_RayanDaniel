package area;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar la base del triángulo
		System.out.print("Ingresa la longitud de la base del triángulo: ");
		double base = scanner.nextDouble();

		// Solicitar la altura del triángulo
		System.out.print("Ingresa la altura del triángulo: ");
		double altura = scanner.nextDouble();

		// Calcular el área del triángulo
		double area = (base * altura) / 2;

		// Mostrar el resultado
		System.out.println("El área del triángulo es: " + area);

		// Solicitar al usuario que ingrese el radio de la circunferencia
		System.out.print("Ingrese el radio de la circunferencia: ");
		double radio = scanner.nextDouble();

		// Calcular el área y el perímetro
		double areaCir = calcularArea(radio);
		double perimetro = calcularPerimetro(radio);

		// Mostrar los resultados
		System.out.println("Área de la circunferencia: " + area);
		System.out.println("Perímetro de la circunferencia: " + perimetro);

	}

	// Función para calcular el área de la circunferencia
	public static double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	// Función para calcular el perímetro de la circunferencia
	public static double calcularPerimetro(double radio) {
		return 2 * Math.PI * radio;
	}

}