package by.tms.lesson20.onl30.thread.asterisk;

public class Store {
    private static int quantityProduct = 0;

    public static synchronized void acceptProduct() {
        quantityProduct++;
    }

    public static synchronized void sellProduct() {
        quantityProduct--;
    }

    public static int makeReconciliation() {
        return quantityProduct;
    }
}