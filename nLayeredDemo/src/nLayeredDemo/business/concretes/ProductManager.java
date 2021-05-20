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
		// iþ kodlarý yazýlýr, kurallar yazýlýr
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride ürün kabul edilmiyor.");
			return;
		}
		this.productDao.add(product); //yani hiçbir þekilde hibernate baðýmlýlýðým yok.
		//HibernateProductDao dao=new HibernateProductDao();
	    //dao.add(product); bunu yaparsak unitTest yazamayýz. Ç
		//Çünkü: unitTest kodu kodla test eden bir yöntem. Ve unit test derki iþ katmanýný test ederken veri tabanýna gidemezsin ama bu þekilde yazýnca gidiyor. Ýþte bu gerçekçi deðil.
	
		this.loggerService.logToSystem("Ürün eklendi: "+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
