import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return cartItems.equals(cart.cartItems) && listOfItems.equals(cart.listOfItems) && deletedList.equals(cart.deletedList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartItems, listOfItems, deletedList);
    }

    private List<Product> cartItems = new ArrayList<>();
    private List<Item> listOfItems = new ArrayList<>();
    private List<Product> deletedList = new ArrayList<>();

    public String add(Product product) {
        cartItems.add(product);
        return product.getProductName();
    }

    public List<Product> remove(Product product){
        if(cartItems.contains(product)){
            cartItems.remove(product);
            deletedList.add(product);
        }
        return deletedList;
    }

    public boolean addItem(Item item) {
        return listOfItems.add(item);
    }

    public List<Product> getItems() {
        return cartItems;
    }
}
