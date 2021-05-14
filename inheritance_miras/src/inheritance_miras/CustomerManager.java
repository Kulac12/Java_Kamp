package inheritance_miras;
//müþteri ile ilgili operasyonlarý yönetecek iþ sýnýfýmýz

public class CustomerManager {

	// müþteri ekleme metodu
	public void add(Customer customer) {
		System.out.println(customer.customerNumber  + "  kaydedildi.");
	}
	
	
	//ben ayný anda birçok müþteriyi eklemek istiyorum
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers) {
			add(customer);
		}
	}
}
