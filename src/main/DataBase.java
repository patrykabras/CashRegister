package main;
import java.util.HashMap;
/**
 * DataBase
 */
public class DataBase {

    public HashMap<String,Repo> data= new HashMap<String,Repo>() ;
    public void setRepo(Repo r){
            data.put(r.name, r);
    }
    public ReceiptsRepo getReceipts(){
        return (ReceiptsRepo)data.get("Receipts");
    }
    public ProductsRepo getProducts(){
        return (ProductsRepo)data.get("Products");
    }
}