package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class CreateDailyRaport implements IAction{

	@Override
	public void Execute(DataBase DB) {
		System.out.println("Tworzenie daily raport");
		DailyRaport temp = new DailyRaport();
		ReceiptsRepo receiptR = DB.getReceipts();
	}
// 	private DailyRaport dailyRaport = new DailyRaport();
// 	public DailyRaport create(ReceiptsRepo receiptRepo,ProductsRepo productRepo) {
// 		dailyRaport.setAmountOfReceipt(receiptRepo.size());
// 		Vat vatsValues = new Vat();
// 		double valueForAll = 0.0;
// 		for (int i = 0; i < productRepo.size(); i++) {
// 			vatsValues.addNewVat(productRepo.get(i).getVat());
// 		}
// 		for (int i = 0; i < receiptRepo.size(); i++) {
// 			Vat temp = receiptRepo.get(i).getVatRepo();
// //			for (Map.Entry me : temp.entrySet()) {
// //		          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
// //		        }
// 			valueForAll += receiptRepo.get(i).getValue();
// 		}
// 		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
// 		LocalDateTime now = LocalDateTime.now();  
// 		dailyRaport.setDate(dtf.format(now));
// 		dailyRaport.setVatsValues(vatsValues);
// 		dailyRaport.setValue(valueForAll);
// 		return dailyRaport;
// 	}
}
