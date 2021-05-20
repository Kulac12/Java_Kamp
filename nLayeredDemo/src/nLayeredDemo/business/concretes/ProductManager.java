package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
//import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService =loggerService;
	}

	@Override
	public void add(Product product) {
		// i� kodlar� yaz�l�r, kurallar yaz�l�r
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride �r�n kabul edilmiyor.");
			return;
		}
		this.productDao.add(product); //yani hi�bir �ekilde hibernate ba��ml�l���m yok.
		//HibernateProductDao dao=new HibernateProductDao();
	    //dao.add(product); bunu yaparsak unitTest yazamay�z. �
		//��nk�: unitTest kodu kodla test eden bir y�ntem. Ve unit test derki i� katman�n� test ederken veri taban�na gidemezsin ama bu �ekilde yaz�nca gidiyor. ��te bu ger�ek�i de�il.
	
		this.loggerService.logToSystem("�r�n eklendi: "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
