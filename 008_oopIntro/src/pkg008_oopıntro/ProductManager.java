
package pkg008_oopıntro;

public class ProductManager { //burada ürünü ilgilendiren metodları buraya getiriyoruz. Düzen olması için.
    public void addToCart(Product product){ // addToCart bizim verdiğimiz bir isim(sepete ekle)
        System.out.println("Sepete eklendi  " + product.name);
    }
}
