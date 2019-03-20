package main;

public class Product {
	private int code;
	private String name,unit;
	private Double vat,value;

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(Double vat) {
		this.vat = vat;
	}
	public Double getValue() {
		return value;
	}
	public Double getValueWithVat() {
		return value*(1+vat);
	}
	public void setValue(Double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + ", unit=" + unit + ", vat=" + vat + ", value=" + value
				+ "]";
	}
	
	
}
