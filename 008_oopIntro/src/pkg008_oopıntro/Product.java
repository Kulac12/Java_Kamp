
package pkg008_oopıntro;

public class Product {  
    
    public Product(){  // constructor/yapıcı blok
        System.out.println("Ben çalıştım.");
    }
    
    public Product(int id,String name, double unitPrice,String detail ){
        this();
        this.id=id; //this, bu classtaki id'ye parametre olarak aldığın id'yi ata.
        this.name=name;
        this.unitPrice=unitPrice;
        this.detail=detail;
        
    }
    //aynı isimde birden fazla metodunuz olabilir ama parametreleri farklı olmak zorundadır.
    int id; //nesneleri birbirinden ayıran özellik. Primary key gibi
    String name;  //ürünün adı
    double unitPrice; //ürün fiyatı
    String detail; //ürün açıklamsı
    
    
    
    
    
    
}
