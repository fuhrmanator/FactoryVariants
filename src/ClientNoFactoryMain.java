import simple_factory.IProduct;

public class ClientNoFactoryMain {

    public static void main(String[] args) {

        IProduct productA = new no_factory.ProductA(1);
        IProduct productB = new no_factory.ProductB();
        IProduct productC = new no_factory.ProductC();
    }
}
