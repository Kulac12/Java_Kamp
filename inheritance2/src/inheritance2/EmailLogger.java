package inheritance2;

public class EmailLogger extends Logger{

	@Override
	//üzerine yazma, bu miras olarak log alýyor ama üzerine kendi bildiklerini yazýyor
	//ayný method Logger da da var, (miras aldýðým sýnýfta)
	public void log() {
		System.out.println("email yollandý.");
	}
}
