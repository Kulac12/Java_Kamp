/*
sayı asal mı
 */
package miniproje1;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class MiniProje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner k= new Scanner(System.in);
        
        int sayi=k.nextInt();
        boolean isPrime=true; //sayinin asal olduğunu kabul ederek başladım
        
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                isPrime=false;
                break;
            }
        }
        if(sayi<2){
            isPrime=false;
        }
        if(isPrime==true){
            System.out.println("sayi asaldır.");
        }else {
            System.out.println("sayı asal değildir.");
        }
        
        
        
        
    }
    
}
