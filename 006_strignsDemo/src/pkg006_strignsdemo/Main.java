
package pkg006_strignsdemo;

/**
 *
 * @author Monster
 */
public class Main {
  
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel";
         
        System.out.println(mesaj);
        //Stringler bir karakter dizisidir.
        System.out.println("Eleman sayısı: "+ mesaj.length());
        System.out.println("5. eleman : "+ mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj);
       
        System.out.println(mesaj.startsWith("A")); //eğer B ile başlıyorsa true döndürür, diğer türlü false döndürür.
        System.out.println(mesaj.endsWith("l")); // eğer l ile bitiyorsa true döndür
        char[] karakterler =new char[25];
        
        
        mesaj.getChars(0, 5, karakterler, 0); 
    //son parametre karakterleri kaarakter dizisinin kaçıncı indisinden itibaren ata?
    //3.parametre nereye ata?
    //1,2.parametre 0 dan 5'e kadarki elemanları ata
        System.out.println(karakterler);
        
        System.out.println(mesaj.indexOf("a")); // karakterin kaçıncı indiste olduğu bilgisini verecek, ilk bulduğunu verir ve operasyonu bitirir.
        System.out.println(mesaj.lastIndexOf("a")); //aramaya sağdan başladı 
        
    }
    
}
