package simple_factory;

class ProductA implements IProduct {
    private ProductA() {}
    /* funny constructor */
    public ProductA(int i) {
        System.out.println("i=" + i);
    }

    @Override
    public void m1() {

    }

}
