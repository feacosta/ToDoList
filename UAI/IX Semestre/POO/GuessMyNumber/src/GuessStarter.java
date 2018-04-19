import java.util.Random;

public class GuessStarter {
	public static void main(String[] args) {
// pick a random number
		Random random = new Random();
		int number = random.nextInt(20) + 1;
		java.util.Scanner keybd = new java.util.Scanner(System.in);
		int choice = 1;
		
		while (choice != number) {
			System.out.println("Elige un numero:");
			choice = keybd.nextInt();
			keybd.nextLine();
			if (choice > number) {
				System.out.println("El numero secreto es menor al que elegiste");
			}else if (choice < number) {
				System.out.println("El numero secreto es mayor al que elegiste");
			}else {
				System.out.println("Has adivinado el numero!");
			}
		}
		
		System.out.println("El numero secreto era:" + number);
	}
}
