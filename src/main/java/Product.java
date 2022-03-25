import java.util.Objects;

public class Product {
    private String productName;
    private Integer productQuantity;

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public Product(String productName, Integer quantity) {
        this.productName = productName;
        this.productQuantity = quantity;
    }

    public String getProductName(){
        return productName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return productName.equals(product.productName) && productQuantity.equals(product.productQuantity);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(productName, productQuantity);
//    }

}
