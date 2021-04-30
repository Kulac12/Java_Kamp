
package pkg003_loopdemo;

public class Main {

    public static void main(String[] args) {
        for(int i=2; i<=10; i+=2){   // i++ veya i=i+1 aynı şey
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti");
        
        
        int i=1;
        //while
        while( i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("while döngüsü bitti");
        
        //do-While döngüsü
        //bu döngü j=1 j 10'da küçük olduğu müddetçe bu kodu çalıştıracaktır.
        //Farkı şart sağlansın ya da sağlanmasın en az bir defa kod çalışır.
        int j=100;
        do{
            System.out.println("Loglandı");
            System.out.println(j);
            j+=2;
        }while(j<10);
        
        System.out.println("Do-while döngüsü bitti");
    }
    
    
}
