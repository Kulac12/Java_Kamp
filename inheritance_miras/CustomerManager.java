package inheritance_miras;
//m��teri ile ilgili operasyonlar� y�netecek i� s�n�f�m�z

public class CustomerManager {

	// m��teri ekleme metodu
	public void add(Customer customer) {
		System.out.println(customer.customerNumber  + "  kaydedildi.");
	}
	
	
	//ben ayn� anda bir�ok m��teriyi eklemek istiyorum
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer);
		}
	}
}
