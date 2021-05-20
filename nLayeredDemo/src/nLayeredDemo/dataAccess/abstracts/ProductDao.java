package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

//product i�in veri eri�im interface imiz//�r�nle ilgili neler yapar�z
//�r�n ekle,sil,g�ncelle gibi
public interface ProductDao {

	void add(Product product); //�r�n ekle
	void uplate(Product product); //�r�n g�ncelle
	void delete(Product product); //�r�n sil
	Product get(int id);//�r�n ara
	List<Product> getAll(); //�r�n listesi d�nd�rebilir.
}
