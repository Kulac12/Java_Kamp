package interfaces;

public class SmsLogger implements Logger { //logger � sms loggera uygula demek.

	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi. "+ message);
		
	} 

}
