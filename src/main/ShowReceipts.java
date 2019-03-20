package main;

/**
 * ShowReceipts
 */
public class ShowReceipts implements IAction {

    public void Execute(DataBase DB){
        System.out.println("rozmiar listy paragonow :" + DB.getReceipts().size());
        if(!DB.getReceipts().isEmpty()) {
			for (int i = 0; i < DB.getReceipts().size(); i++) {
				System.out.println(DB.getReceipts().get(i).toString());		
				}
		}
    }
}