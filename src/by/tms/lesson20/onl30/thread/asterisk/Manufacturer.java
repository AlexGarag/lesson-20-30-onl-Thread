package by.tms.lesson20.onl30.thread.asterisk;

import static by.tms.lesson20.onl30.thread.LauncherAsterisk.*;
import static by.tms.lesson20.onl30.thread.asterisk.Store.*;
import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Manufacturer implements Runnable {

    @Override
    public void run() {
        while (!currentThread().isInterrupted()) {
            try {
                SECONDS.sleep(DELIVERY_INTERVAL_PRODUCT_IN_SECOND);
            } catch (InterruptedException e) {
                currentThread().interrupt();
            }
            int quantityProductInShop = makeReconciliation();   // свериться по количеству товара в магазине
            if (quantityProductInShop < MAX_POSSIBLE_QUANTITY_PRODUCT_IN_STORE) {                // и если товара меньше отведённого лимита
                acceptProduct();   // поставить товар
            }
            System.out.printf(TEMPLATE_MESSAGE, MANUFACTURER_MESSAGE, QUANTITY_PRODUCT_IN_STORE, quantityProductInShop);
        }
    }
}