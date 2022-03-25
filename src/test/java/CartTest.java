import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    @Test
    void addIPadPro() {
        Cart cart = new Cart();
        Product product = new Product("IPad Pro",1);
        Item item = new Item(product,1);

        boolean isItemAdded = cart.addItem(item);
        String addedProduct = cart.add(product);

        assertEquals(addedProduct, product.getProductName());
        assertTrue(isItemAdded);
    }

    @Test
    void addHeroInkPen() {
        Cart cart = new Cart();
        Product product = new Product("Hero Ink Pen",1);

        String addedProduct = cart.add(product);

        assertEquals(addedProduct, product.getProductName());
    }

    @Test
    void differentiateCart() {
        Cart cart1 = new Cart();
        Product product1 = new Product("IPad Pro",1);
        Item item1 = new Item(product1,1);

        Cart cart2 = new Cart();
        Product product2 = new Product("IPad Pro",1);
        Item item2 = new Item(product2,1);

        cart1.add(product1);
        cart2.add(product2);

        assertTrue(cart1.equals(cart2));
    }

    @Test
    void addGmCricketBat() {
        Cart cart = new Cart();
        Product product = new Product("GM Cricket Bat",2);

        String addedProduct = cart.add(product);

        assertEquals(addedProduct, product.getProductName());
    }

    @Test
    void removeIpadPro() {
        Cart cart = new Cart();
        Product product = new Product("Ipad Pro",1);
        cart.add(product);

       List<Product> deletedItems = cart.remove(product);

        for(Product product1 : deletedItems){
            System.out.println(product1.getProductName());
        }
    }

    @Test
    void getListOfDeletedItems() {
        Cart cart = new Cart();
        Product product1 = new Product("Ipad Pro",1);
        Product product2 = new Product("Cricket Bat",1);

        cart.add(product1);
        cart.add(product2);

        cart.remove(product1);
        List<Product> deletedItems = cart.remove(product2);

        for(Product itemsDeleted : deletedItems){
            System.out.println(itemsDeleted.getProductName());
        }
    }

    //    private boolean removeItems(Product product) {
//        Cart cart = new Cart();
//        boolean isremoved = cart.remove(product.getProductName());
//        return isremoved;
//    }

//    @Test
//    void shouldCheckItemIsPresentOrNot() {
//        Cart cart = new Cart();
//        String product = "IPad Pro";
//
//        cart.add(product);
//
//        List<String> itemsInCart = cart.getItems();
//
//        boolean isProductPresent = false;
//        for (String item : itemsInCart) {
//            if (item.equals(product)) {
//                isProductPresent = true;
//                break;
//            }
//        }
//
//        assertTrue(isProductPresent);
//    }
}