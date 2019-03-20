package main;
import java.util.Scanner;

/**
 * ShowReceipt
 */
public class ShowReceipt implements IAction {

    public void Execute(DataBase DB){
        Scanner input=new Scanner(System.in);
		int receiptId = 0;
    	System.out.println("Podaj id Paragonu do wyswietlenia");
    	receiptId = input.nextInt();
    	System.out.println("Paragon O id : "+receiptId);
    	if(receiptId >= DB.getReceipts().size()) {
		System.out.println("nie ma takiego paragonu");
    	}else {
    	System.out.println(DB.getReceipts().get(receiptId).toString());
    	}
    }
    
}