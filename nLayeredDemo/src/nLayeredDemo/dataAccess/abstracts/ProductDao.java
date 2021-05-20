package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

//product için veri eriþim interface imiz//ürünle ilgili neler yaparýz
//ürün ekle,sil,güncelle gibi
public interface ProductDao {

	void add(Product product); //ürün ekle
	void uplate(Product product); //ürün güncelle
	void delete(Product product); //ürün sil
	Product get(int id);//ürün ara
	List<Product> getAll(); //ürün listesi döndürebilir.
}
