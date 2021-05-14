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

//miras yap�s� ile beraber �unu sa�l�yoruz; bizim iki s�n�f�m�z var baz� �zellikleri benzerse
//bu ortak �zellikleri tutan bir s�n�f tan�mlar ve di�er s�n�flar�ndan bu s�n�ftan miras almas�n� sa�lar�z.