package Midterm;

import java.util.Arrays;

public class Store {
    private Product[] products;
    private DiscountedProduct[] discountedProducts;
    private int productCount;
    private int discountedProductCount;

    public Store() {
        this.products = new Product[10]; // Initial capacity for regular products
        this.discountedProducts = new DiscountedProduct[10]; // Initial capacity for discounted products
        this.productCount = 0;
        this.discountedProductCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            // Resize array if necessary
            products = Arrays.copyOf(products, products.length * 2);
            products[productCount++] = product;
        }
    }

    public void addDiscountedProduct(DiscountedProduct discountedProduct) {
        if (discountedProductCount < discountedProducts.length) {
            discountedProducts[discountedProductCount++] = discountedProduct;
        } else {
            // Resize array if necessary
            discountedProducts = Arrays.copyOf(discountedProducts, discountedProducts.length * 2);
            discountedProducts[discountedProductCount++] = discountedProduct;
        }
    }

    public void displayAllProducts() {
        System.out.println("Regular Products:");
        for (int i = 0; i < productCount; i++) {
            products[i].displayInformation();
        }

        System.out.println("Discounted Products:");
        for (int i = 0; i < discountedProductCount; i++) {
            discountedProducts[i].displayInformation();
        }
    }
}
