
package pkg007_stringsdemo2;

public class Main {

    public static void main(String[] args) {
       String mesaj="     Bugün hava çok güzel      ";
         
        System.out.println(mesaj);
        String yenimesaj = (mesaj.replace(' ', '-')); 
        //ilgili metni değiştirmez yeni bir çıktı üretir.
        //eski mesajın içeriğini değiştirmek için kullanılır.
        System.out.println(yenimesaj);
        System.out.println(mesaj);
        
    
        System.out.println(mesaj.substring(2)); //kaçıncı indeksten itibaren yazayım
        System.out.println(mesaj.substring(2,5)); //2. indeksten 5. indekse kadar kes
        
        for(String kelime: mesaj.split(" ")){ //kelimeleri boşluğa göre ayır
            System.out.println(kelime);
        }
        
        System.out.println(mesaj.toLowerCase()); //bütün harfleri küçültmeye yarıyor.
        System.out.println(mesaj.toUpperCase()); //bütün harfleri büyültmeye yarıyor.
        System.out.println(mesaj.trim()); //yukarıdaki ifadenin başındaki ve sonundaki boşlukları atmaya yarar.
        
    }
    
}
