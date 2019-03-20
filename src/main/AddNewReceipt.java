package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AddNewReceipt implements IAction {

	public void Execute(DataBase DB) {
		Scanner input=new Scanner(System.in);
		Receipt receipt = makeReceipt(input,DB);
		if(receipt==null){
			System.out.println("Nie dodano");
			return;
		}
		PaymentMethod payMethod = new PaymentMethod();
			if(DB.getReceipts().size() > 0) {
				long tempForId = DB.getReceipts().getLastId() + 1;
				receipt.setId(tempForId);
			}
			else receipt.setId(0);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			receipt.setDate(dtf.format(now));
			
			payMethod.chooseMethod(receipt.getValue());
			receipt.setPaymentMethod(payMethod.getPaymentMethod());
			DB.getReceipts().add(receipt);
	}
	private Receipt makeReceipt(Scanner input,DataBase DB){
		Receipt receipt= new Receipt();
		if(DB.getReceipts().size() > 0) {
			System.out.println("Paragon id : " +(DB.getReceipts().getLastId() + 1));
		}
		else System.out.println("Paragon id : 0");

		while(true) {
				System.out.println("Wybierz operacje : +(dodaj),-(pomin),x(anuluj),=(podsumuj)");
				char tempo = input.next().charAt(0);
				switch(tempo) {
				case '+':
					System.out.println("Podaj kod produktu:");
					Product p = DB.getProducts().getProductWithCode(input.nextInt());
					if(p==null){
						System.out.println("nie ma takiego productu, Ponow Operacje");
						break;
					} 
					System.out.println("Ile chcesz "+p.getUnit()+" "+ p.getName());
					double q = input.nextDouble();
					double price = p.getValue() * q;
					System.out.println(p.getName()+" "+q+p.getUnit()+" "+price);
					receipt.addProduct(p,q);
					break;
				case '-':
					break;
				case 'x':
					return null;
				case '=':

					receipt.print();
					return receipt;
				}
		}
	}

}
