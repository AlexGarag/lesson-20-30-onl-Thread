package by.tms.lesson20.onl30.thread.asterisk;

import static by.tms.lesson20.onl30.thread.LauncherAsterisk.*;
import static by.tms.lesson20.onl30.thread.asterisk.Shop.*;
import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Manufacturer implements Runnable {
    private static int quantityGoodsProduced = 0;

    private static void deliverProduct() {
        acceptProduct(); // поставить товар в Магазин
        quantityGoodsProduced++;
    }

    @Override
    public void run() {
        while (!currentThread().isInterrupted()) {
            try {
                SECONDS.sleep(DELIVERY_INTERVAL_PRODUCT_IN_SECOND);
            } catch (InterruptedException e) {
                currentThread().interrupt();
            }
            int quantityProductInShop = makeReconciliation();   // свериться по количеству товара в магазине
            if (quantityProductInShop < MAX_POSSIBLE_QUANTITY_PRODUCT_IN_SHOP) {                // и если товара меньше отведённого лимита
                deliverProduct();   // поставить товар
            }
            System.out.printf(TEMPLATE_MESSAGE, MANUFACTURER_MESSAGE, quantityGoodsProduced,
                    QUANTITY_PRODUCT_IN_SHOP, quantityProductInShop); // сообщить
        }
    }
}