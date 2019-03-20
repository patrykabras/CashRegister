package main;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class ReceiptsRepo extends Repo<Receipt> {
	private List<Receipt> receiptRepo;

	public ReceiptsRepo(String basePath) {
		super(basePath,"Receipts");
	}
	public long getLastId() {
		return repo.get(size()-1).getId();
	}
	@Override
	public void LoadData(String basePath){
// 		File loader = new File(basePath+ "\\KatalogDzienny");
// 		boolean skipFirstLine = true;
// 		if(loader.exists()) {
// 			try {
// 				Scanner input = new Scanner(loader);
// 		        while (input.hasNextLine()) {
// 		            String line = input.nextLine();
// 		            String temp[] = line.split(",");
// 		            if(!skipFirstLine) {
// //listOfReceipts.add(new Receipt(Integer.parseInt(temp[0]),temp[1],Integer.parseInt(temp[2]),Float.parseFloat(temp[3]))); 
		            
// 		            }
// 		            skipFirstLine = false;
// 		        }input.close();
// 			} catch (Exception e) {
// 				e.printStackTrace();
// 			}
// 		}
		
	}
}
