package main;

import java.util.Scanner;

public class PaymentMethod {
	private String paymentMethod;
	public String chooseMethod(double value) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Metoda platosci:");
		System.out.println("1 - Gotowka / 2 - Karta");
		switch(userInput.nextInt()){
		case 1:
			System.out.println("Podaj kwote gotowki:");
			double userMoney = userInput.nextDouble();
			double oddMoney = userMoney - value;
			System.out.printf("Reszty : %.2f zl\n",oddMoney);
			paymentMethod = "gotowka";
			break;
		case 2:
			System.out.println("Prosze podac cztery ostatnie cyfry numeru karty");
			String lastDigit = userInput.nextLine();
			System.out.println("***"+lastDigit+" Zatwierdzona platnosc");
			paymentMethod = "karta";
			break;
		default:
			paymentMethod = "none";
			break;
		}
		return paymentMethod;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
}
