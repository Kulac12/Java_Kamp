package inheritance2;

//m��teri i�lerini yapan s�n�f
//Alt�n kural: Bir i� yapan s�n�f ba�ka bir i� yapan s�n�f� kullanacaksa;
//asla ve asla somut s�n�ftan gidilmez.
//Somut s�n�f:i� yapan s�n�flara somut s�n�f deniyor.
public class CustomerManager {

	public void add(Logger logger) { 
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi.");
	//	DatabaseLogger logger=new DatabaseLogger(); bu kod ileriye d�n�k bizi s�k�nt�ya sokar.
		logger.log();
	}
}
