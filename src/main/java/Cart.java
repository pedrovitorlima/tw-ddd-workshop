import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {

    private List<Item> listOfItems = new ArrayList<>();
    private List<Item> deletedList = new ArrayList<>();

    public boolean addItem(Item item) {
        return listOfItems.add(item);
    }

    public List<Item> remove(Item item){
        if (listOfItems.remove(item)) {
            deletedList.add(item);
        }

        return deletedList;
    }

    public List<Item> getListOfItems() {
        return listOfItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return listOfItems.equals(cart.listOfItems) && deletedList.equals(cart.deletedList);
    }
}
