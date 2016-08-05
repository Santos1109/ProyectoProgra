import java.util.Scanner;
public class HolaMundo {
	public static void main (String[]args){
		double num;
		Scanner lea=new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		num=lea.nextDouble();
		if(num>10){
			System.out.print("El numero es mayor que 10");
		}else{
			System.out.print("El numero es menor que 10");
		}
	}
}
