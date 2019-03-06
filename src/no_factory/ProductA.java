package no_factory;

import simple_factory.IProduct;

public class ProductA implements IProduct {
    private ProductA() {}
    /* funny constructor */
    public ProductA(int i) {
        System.out.println("i=" + i);
    }
}
