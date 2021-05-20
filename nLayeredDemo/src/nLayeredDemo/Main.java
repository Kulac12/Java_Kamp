package nLayeredDemo;


import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdaptor;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		
		//ALTIN KURAL: bir projede entityler hariç new liyorsanýz ilerde sorun yaþayacaksýnýz.
		//ToDo: Spring Ioc ile çözülecek
		ProductService productService=new ProductManager(new AbcProductDao(),
				new JLoggerManagerAdaptor()); //bu kötü kod ilerde çözülecek
		
		Product product=new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
