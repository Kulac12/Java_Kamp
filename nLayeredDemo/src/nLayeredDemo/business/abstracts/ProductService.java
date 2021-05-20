package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

//iþ sýnýfý interface leri service olarak veriyoruz.
public interface ProductService {

	//biz burada neyi service etmek istiyorsak o metodlarý yazýyoruz.Örn. ekleme olsun
	void add(Product product);
	List<Product> getAll();
	
	
}
