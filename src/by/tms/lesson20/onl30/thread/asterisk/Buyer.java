package by.tms.lesson20.onl30.thread.asterisk;

import static by.tms.lesson20.onl30.thread.LauncherAsterisk.*;
import static by.tms.lesson20.onl30.thread.asterisk.Shop.*;
import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Buyer implements Runnable {
    private static int quantityPurchasedItems = 0;

    public Buyer() {
        Shop shop = new Shop();
    }

    private static int buyProduct() {
        sellProduct(); // купить в Магазине
        return quantityPurchasedItems++;
    }

    @Override
    public void run() {
        while (!currentThread().isInterrupted()) {
            try {
                SECONDS.sleep(DELIVERY_INTERVAL_PURCHASE_IN_SECOND);
            } catch (InterruptedException e) {
                currentThread().interrupt();
            }
            System.out.printf(TEMPLATE_MESSAGE, BUYER_MESSAGE, buyProduct(),
                    QUANTITY_PRODUCT_SHOP, makeReconciliation()); // купить товар, сверить и сообщить
        }
    }
}
