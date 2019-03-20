 package main;

    public class DailyRaport {
 	private Vat vatsValues;
 	private int amountOfReceipt;
 	private String date;
 	private double value;
 	public Vat getVatsValues() {
 		return vatsValues;
 	}
 	public void setVatsValues(Vat vatsValues) {
 		this.vatsValues = vatsValues;
 	}
 	public int getAmountOfReceipt() {
 		return amountOfReceipt;
 	}
 	public void setAmountOfReceipt(ReceiptsRepo tempReceiptRepo) {
 		this.amountOfReceipt = countReceipts(tempReceiptRepo);
 	}
 	public void setAmountOfReceipt(int amount) {
 		this.amountOfReceipt = amount;
 	}
 	public String getDate() {
 		return date;
 	}
 	public void setDate(String date) {
 		this.date = date;
 	}
 	public double getValue() {
 		return value;
 	}
 	public void setValue(double value) {
 		this.value = value;
 	}
 	private int countReceipts(ReceiptsRepo tempReceiptRepo) {
 		int counter = 0;
 		return counter;
 	}
 }
