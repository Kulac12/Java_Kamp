
package pkg008_oopıntro;

public class Main {

    public static void main(String[] args) {
  
        Product product4 = new Product(1,"Monster",1500,"5Gb");
        
        Product product1 = new Product(); //örnek oluşturma, referans oluşturma, instance
        //Product sınıfından bir referans oluşturduk. 
        
        product1.id=1;
        product1.name="Lenovo V14";
        product1.unitPrice=15000;
        product1.detail="16 GB Ram";
        
        Product product2 = new Product(); //örnek oluşturma, referans oluşturma, instance
        //Product sınıfından bir referans oluşturduk. 
        
        product2.id=1;
        product2.name="Lenovo V15";
        product2.unitPrice=1500;
        product2.detail="4 GB Ram";
        
        Product product3 = new Product(); //örnek oluşturma, referans oluşturma, instance
        //Product sınıfından bir referans oluşturduk. 
        
        product3.id=1;
        product3.name="Hp 5";
        product3.unitPrice=5000;
        product3.detail="8 GB Ram";
        
        Product[] products = {product1,product2,product3,product4}; //getProducts();
        
        for(Product product : products){
            System.out.println(product.name);
            System.out.println(product.unitPrice);
            System.out.println(product.detail);
            System.out.println("                         ");
            System.out.println("-------------------------");
            System.out.println("                         ");
        }
        
        System.out.println(products.length);
        
        
        Category category1=new Category();
        category1.id=1;
        category1.name="Bilgisayar";
        
        Category category2=new Category();
        category2.id=2;
        category2.name="Ev/Bahçe";
        
        Category category3=new Category();
        category3.id=3;
        category3.name="Moda";
        
        ProductManager productManager=new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);
       
                
    }
    
}
