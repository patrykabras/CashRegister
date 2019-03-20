package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Receipt {
	private long id;
	private String date,paymentMethod;
	private List<Product> products = new ArrayList<Product>();
	private List<Double> quantities = new ArrayList<Double>();
	private HashMap<Double,Double> vats= new HashMap<Double,Double>();
	private Double value=0.0;
	//#region  getters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getValue(){
		return value;
	}
	public HashMap<Double,Double> getVats(){
		return vats;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	//#endregion
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public void addProduct(Product p,Double q){
		products.add(p);
		quantities.add(q);
		value+=p.getValueWithVat()*q;
		Double v=p.getVat();
		Double vV=vats.get(v);
		if(vV==null) vV=0.0;
		vats.put(v, +(p.getValueWithVat()-p.getValue())*q);
	}
	//#region print functions
	public void printHeader(){
		System.out.println(Helper.padEnd("", 100,'-'));
		System.out.print(Helper.padEnd("produkt", 20));
		System.out.print(Helper.padEnd("cena j.", 20));
		System.out.print(Helper.padEnd("ilosc", 20));
		System.out.print(Helper.padEnd("stawka vat", 20));
		System.out.print(Helper.padEnd("razem", 20));
		System.out.print("\n");
	}
	public void printProduct(Product p,Double q){
		System.out.print(Helper.padEnd(p.getName(), 20));
		System.out.print(Helper.padEnd(""+p.getValue()+p.getUnit(), 20));
		System.out.print(Helper.padEnd("x"+q, 20));
		System.out.print(Helper.padEnd(""+p.getVat(), 20));
		System.out.printf("%.2f\n",p.getValueWithVat()*q);
	}
	public void printVats(){
		for (Entry<Double, Double> entry : vats.entrySet()) {
			Double key = entry.getKey();
			Double vatValue = entry.getValue();
			System.out.print( Helper.padEnd("VAT "+key, 20));
			System.out.printf(" %.2f\n", vatValue);
		}
	}
	//#endregion
	public void print(){
		printHeader();
		for(int i=0;i<products.size();i++){
			Product p=products.get(i);
			double q=quantities.get(i);
			printProduct(p, q);
		}
		System.out.println(Helper.padEnd("", 100, '-'));
		printVats();
		System.out.println(Helper.padEnd("", 100,'-'));
		System.out.printf("Do zaplaty: %.2f zl\n",value);
	}
	
	
	@Override
	public String toString(){
		return "id: "+getId()+" data: "+getDate()+" ilosc‡: "+products.size()+" wartosc‡ sprzedazy: "+value+"\n";
	}
}
