package main;

import java.util.HashMap;
import java.util.Map;

public class Vat {
	private HashMap<Double, Double>  vatList = new HashMap<Double, Double>();
	public Double get(Double key) {
		return vatList.get(key);
	}
	public void addToVat(Double key,Double value) {
		double temp = vatList.get(key);
		temp += value;
		vatList.put(key, temp);
	}
	public void addNewVat(Double key){
		vatList.putIfAbsent(key, 0.0);
	}
	public void showVatList(){
		for (Map.Entry<Double, Double> me : vatList.entrySet()) {
	          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
	        }
	}
	
	@Override
	public String toString() {
		String temp = "";
		temp += "{";
		for (Map.Entry<Double, Double> me : vatList.entrySet()) {
			temp += "[";
	        temp += "Key: "+me.getKey() + " & Value: " + me.getValue();
			temp+="]";
		}
		return temp;
	}
	
}
