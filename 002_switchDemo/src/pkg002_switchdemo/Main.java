
package pkg002_switchdemo;

public class Main {

    public static void main(String[] args) {
        char grade= 'F';    //grade=not
        switch(grade){
            case 'A':    //eğer not 'A' ise ne yapayım
                System.out.println("Mükemmel: geçtiniz");
                break;
            case 'B': 
                System.out.println("Çok güzel: Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef kaldınız.");
                break;
                
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
    
}
