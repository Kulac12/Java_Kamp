package nLayeredDemo;


import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdaptor;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		
		//ALTIN KURAL: bir projede entityler hari� new liyorsan�z ilerde sorun ya�ayacaks�n�z.
		//ToDo: Spring Ioc ile ��z�lecek
		ProductService productService=new ProductManager(new AbcProductDao(),
				new JLoggerManagerAdaptor()); //bu k�t� kod ilerde ��z�lecek
		
		Product product=new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
