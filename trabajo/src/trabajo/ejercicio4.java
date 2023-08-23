package prueba;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	int a,b,c;
	int res;
	System.out.println("*Solo numeros tienen que ser enteros*\n");
	
	
	System.out.print("eliga la operacion 1(suma)2(resta)3(multiplicacion)4(division): ");
	c = scanner.nextInt();
		System.out.print("ingrese el 1° numero: " );
		a = scanner.nextInt();
		
		System.out.print("ingrese el 2° numero: " );
		b = scanner.nextInt();
		
		
		if(c == 1) {
			res = suma(a,b);
			System.out.print("suma = "+ res);
			
		}else if(c == 2) {
			res = resta(a,b);
			System.out.print("resta = "+ res);
			
		}else if(c == 3) {
			res = multiplicacion(a,b);
			System.out.print("multiplicacion = "+ res );
		}else if(c == 4) {
			res = division(a,b);
			System.out.print("division = "+ res);
		}
	
		
	}
	
	public static int suma(int a, int b) {
		return a + b;
	}
	public static int resta(int a, int b) {
		return a - b;
	}
	public static int multiplicacion(int a, int b) {
		return a * b;
	}
	public static int division(int a, int b) {
		return a / b;
	}
}
