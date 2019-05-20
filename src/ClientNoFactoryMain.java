import no_factory.ProductC;
import simple_factory.IProduct;

public class ClientNoFactoryMain {

    public static void main(String[] args) {

        IProduct productA = new no_factory.ProductA(1, 2);
        IProduct productB = new no_factory.ProductB();
        IProduct productC = new ProductC();
    }
}
