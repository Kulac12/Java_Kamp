
package pkg004_arraysdemo;

public class Main {

    public static void main(String[] args) {
        
        
        
        String[] ogrenciler = new String[3];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        
        //kötü kod
        for(int i=0; i<ogrenciler.length;i++){
           System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------------");
        //iyi kod
        for(String ogrenci:ogrenciler){ //ogrenciler dizisindeki her bir elemanı gez. Ve onlara bir takma isim ver. ogrenci-buna istediğimiz ismi verebiliriz.
            System.out.println(ogrenci);
        }
    }
    
}
