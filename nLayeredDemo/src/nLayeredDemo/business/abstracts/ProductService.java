package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

//i� s�n�f� interface leri service olarak veriyoruz.
public interface ProductService {

	//biz burada neyi service etmek istiyorsak o metodlar� yaz�yoruz.�rn. ekleme olsun
	void add(Product product);
	List<Product> getAll();
	
	
}
