package inheritance2;

//müþteri iþlerini yapan sýnýf
//Altýn kural: Bir iþ yapan sýnýf baþka bir iþ yapan sýnýfý kullanacaksa;
//asla ve asla somut sýnýftan gidilmez.
//Somut sýnýf:iþ yapan sýnýflara somut sýnýf deniyor.
public class CustomerManager {

	public void add(Logger logger) { 
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi.");
	//	DatabaseLogger logger=new DatabaseLogger(); bu kod ileriye dönük bizi sýkýntýya sokar.
		logger.log();
	}
}
