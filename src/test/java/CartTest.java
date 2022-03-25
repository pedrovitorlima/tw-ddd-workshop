import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void addItemsIsPresent() {
        Cart cart = new Cart();
        Product product = new Product("IPad Pro");
        Item item = new Item(product, 1);

        cart.addItem(item);

        List<Item> addedItems = cart.getListOfItems();

        itemShouldBeInTheList(item, addedItems);
    }


    @Test
    void addIPadPro() {
        testAddNewItemToCart(new Product("IPad Pro"));
    }

    @Test
    void addHeroInkPen() {
        testAddNewItemToCart(new Product("Hero Ink Pen"));
    }

    @Test
    void addGmCricketBat() {
        testAddNewItemToCart(new Product("GM Cricket Bat"));
    }

    private void testAddNewItemToCart(Product product) {
        Cart cart = new Cart();
        Item item = new Item(product,1);

        boolean isItemAdded = cart.addItem(item);

        assertTrue(isItemAdded);
    }

    @Test
    void equalCarts() {
        Cart cart1 = new Cart();
        Product product1 = new Product("IPad Pro");
        Item item1 = new Item(product1,1);
        cart1.addItem(item1);

        Cart cart2 = new Cart();
        Product product2 = new Product("IPad Pro");
        Item item2 = new Item(product2,1);
        cart2.addItem(item2);

        assertTrue(cart1.equals(cart2));
    }

    @Test
    void differentiateCarts() {
        Product ipadPro = new Product("IPad Pro");

        Cart cart1 = new Cart();
        Item item1 = new Item(ipadPro,1);
        cart1.addItem(item1);

        Cart cart2 = new Cart();
        Item item2 = new Item(ipadPro,1);
        cart2.addItem(item2);

        Product ipadAir = new Product("IPad Air");
        Item item3 = new Item(ipadAir,1);
        cart2.addItem(item3);

        assertFalse(cart1.equals(cart2));
    }

    @Test
    void removeIpadPro() {
        Cart cart = new Cart();
        Product product = new Product("Ipad Pro");
        Item item = new Item(product, 1);

        cart.addItem(item);

        //ALSO testing if it returns a list of elements, so I removed the getListOfDeletedItems
        List<Item> deletedItems = cart.remove(item);
        itemShouldBeInTheList(item, deletedItems);
    }

    private void itemShouldBeInTheList(Item item, List<Item> listOfItems) {
        Optional<Item> removedItem = listOfItems.stream()
                .filter(x -> x.equals(item))
                .findFirst();

        assertTrue(removedItem.isPresent());
        removedItem.ifPresent(x -> assertEquals(item, x));
    }
}