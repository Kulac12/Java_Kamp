package interfaces;

public class CustomerManager {
	private Logger[] loggers; //biz neye baðýmlýysak onun private deðiþkenini yapýyoruz.
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}
	

	//loosly -tightly coupled 
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: "+ customer.getFirstName());
		
		Utils.runLogger(loggers, customer.getFirstName());
		
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi: "+ customer.getFirstName());
		
		Utils.runLogger(loggers, customer.getFirstName());
		
	}
}
