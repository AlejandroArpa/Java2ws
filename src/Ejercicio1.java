
class Product {
    public String name;
    public float price;
    public int stock;

    public Product(String name, float price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void addStock(int qty){
        if(qty<0){
            System.out.println("Invalid quantity");
        }
        stock = stock + qty;
    }

    public void rmvStock (int qty) {
        if(qty<0){
            System.out.println("Invalid quantity");
            return;
        }
        int newStock = stock - qty;
        if ( newStock < 0 ){
            System.out.println("No se puede restar esa cantidad");
        }
        else {
            stock = newStock;
        }
    }

    public float calculateValueStock () {
        return stock * price;
    }
}

public class Ejercicio1 {

    public static void main(String[] args) {
        Product producto1 = new Product("Mi producto", 15000, 10);
        System.out.println(producto1.calculateValueStock());
        System.out.println(producto1.stock);
        producto1.rmvStock(15);
        producto1.rmvStock(9);
        producto1.rmvStock(-9);
        System.out.println(producto1.stock);
    }
}
