package inheritance2;

public class EmailLogger extends Logger{

	@Override
	//�zerine yazma, bu miras olarak log al�yor ama �zerine kendi bildiklerini yaz�yor
	//ayn� method Logger da da var, (miras ald���m s�n�fta)
	public void log() {
		System.out.println("email yolland�.");
	}
}
