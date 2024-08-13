package by.tms.lesson20.onl30.thread.asterisk;

import static by.tms.lesson20.onl30.thread.LauncherAsterisk.*;
import static by.tms.lesson20.onl30.thread.asterisk.Store.*;
import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Buyer implements Runnable {

    @Override
    public void run() {
        while (!currentThread().isInterrupted()) {
            try {
                SECONDS.sleep(DELIVERY_INTERVAL_PURCHASE_IN_SECOND);
            } catch (InterruptedException e) {
                currentThread().interrupt();
            }
            int quantityProductInShop = makeReconciliation();   // свериться по количеству товара в магазине
            if (quantityProductInShop > 0) {    // и если есть товар, то
                sellProduct();   // купить его
            }
            System.out.printf(TEMPLATE_MESSAGE, BUYER_MESSAGE, QUANTITY_PRODUCT_IN_STORE, quantityProductInShop); // сообщить результат
        }
    }
}