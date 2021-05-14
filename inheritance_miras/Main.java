package inheritance_miras;

public class Main {

	public static void main(String[] args) {
		
	IndividualCustomer engin=new IndividualCustomer();
	engin.customerNumber="12345";
		
	CorporateCustomer HepsiBurada=new CorporateCustomer();
	HepsiBurada.customerNumber="45645";
	
	SendikaCustomer abc=new SendikaCustomer();
	abc.customerNumber="99999";
	
	CustomerManager customerManager=new CustomerManager();
	
	Customer[] customers= {engin,HepsiBurada,abc};
	
	customerManager.addMultiple(customers);
	
	}

}

//miras yapýsý ile beraber þunu saðlýyoruz; bizim iki sýnýfýmýz var bazý özellikleri benzerse
//bu ortak özellikleri tutan bir sýnýf tanýmlar ve diðer sýnýflarýndan bu sýnýftan miras almasýný saðlarýz.