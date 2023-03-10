package Models;

import java.util.List;

public interface IDAO <T>{
	void addElement(T t);
	void uppdateElement(T t);
	void deleteElement(int t);
	T getElement(int id);
	List<T> getElements();
}
