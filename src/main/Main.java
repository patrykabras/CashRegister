package main;

import java.util.Scanner;
import java.io.File;
// Main zamiast CashRegister
public class Main {
	static private boolean working=true;
	static private DataBase DB = new DataBase();
	public static void main(String[] args) {	
		Scanner input=new Scanner(System.in);
		init();
		do{
			showOptions();
			IAction action = getAction(input.nextLine().charAt(0));
			if(action!=null)
			action.Execute(DB);
		}while(working);
		input.close();
	}

	private static void init(){
		String basePath = new File("").getAbsolutePath();
		File PlaceForParag = new File(basePath + "\\KatalogDzienny");
        if (!PlaceForParag.exists())PlaceForParag.mkdir(); 
		DB.setRepo(new ProductsRepo(basePath));
		DB.setRepo(new ReceiptsRepo(basePath));
	}
	private static void showOptions(){
		System.out.println("P - dodaj paragon \nL - lista paragonow \nW - wyswietl paragon \nR - raport dobowy \nK - koniec pracy z programem \n\n Wybierz opcje:");
	}
	private static IAction getAction(char input){
		
		switch(input){
		    case 'P':
		    case 'p':
					System.out.println("AddReceipt");
					return new AddNewReceipt();
		    case 'L':
		    case 'l':
		    	return new ShowReceipts();
		    case 'W':
		    case 'w':
				return new ShowReceipt();
		    case 'R':
			case 'r':
				return new CreateDailyRaport();
		    case 'K':
			case 'k':
				working=false;
		    	return new ExitAction();
		    default:
				System.out.println("Nie ma takiej Opcji");
				return null;
		    }
	}

}


