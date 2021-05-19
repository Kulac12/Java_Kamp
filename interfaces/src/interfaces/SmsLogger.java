package interfaces;

public class SmsLogger implements Logger { //logger ý sms loggera uygula demek.

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi. "+ message);
		
	} 

}
