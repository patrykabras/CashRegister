package main;
import java.util.ArrayList;
import java.util.List;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Repo<T>{
    public String name;
    protected List<T> repo;
    public Repo (String basePath,String _name){
        repo= new ArrayList<T>();
        name=_name;
        LoadData(basePath);
    }
    public void LoadData(String basePath){
        throw new NotImplementedException();
    };
    public void add(T temp) {
		repo.add(temp);
    }
    public T get(int id) {
		return repo.get(id);
    }
    public int size() {
		return repo.size();
    }
    public boolean isEmpty() {
		return repo.isEmpty();
	}
}