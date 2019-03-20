package main;

import java.io.File;
import java.util.Scanner;

public class ProductsRepo extends Repo<Product>  {

	public ProductsRepo(String basePath) {
		super(basePath,"Products");
	}
	public Product getProductWithCode(int code) {

		for (int i = 0; i < repo.size(); i++) {
			if(repo.get(i).getCode() == code) {
				return repo.get(i);
			}
		}
		return null;

	}
	@Override
	public void LoadData(String basePath){
		File loader = new File(basePath+ "\\arkusz.csv");
		boolean skipFirstLine = true;
		if(loader.exists()) {
			try {
				Scanner input = new Scanner(loader);
		        while (input.hasNextLine()) {
		        	Product tempProduct = new Product();
		            String line = input.nextLine();
		            String temp[] = line.split(",");
		            if(!skipFirstLine) {
		            tempProduct.setCode(Integer.parseInt(temp[0]));
		            tempProduct.setName(temp[1]);
		            tempProduct.setUnit(temp[2]);
		            tempProduct.setVat(Double.parseDouble(temp[3]));
		            tempProduct.setValue(Double.parseDouble(temp[4]));
		            add(tempProduct);
		            }
		            skipFirstLine = false;
		        }input.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Product download!");
	}
}
