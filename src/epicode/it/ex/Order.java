package epicode.it.ex;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products = new ArrayList<>();
    private Customer customer;

    public Order(Customer customer) {
        this.orderDate = LocalDate.now();
        this.customer = customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }


    public static void main(String[] args) {
        Customer c2 = new Customer("Mauro",1);
        Customer c1 = new Customer("Marco",2);
        Product p1 = new Product("Tv 45", "Eletronics", 3000.0);
        Product p2 = new Product("Tv 65", "Eletronics", 3000.0);

        Order o1 = new Order(c1);


        o1.getProducts().add(p1);
        o1.getProducts().add(p2);

    }
}
