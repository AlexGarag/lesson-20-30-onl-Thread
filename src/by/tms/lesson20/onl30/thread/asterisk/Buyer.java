package by.tms.lesson20.onl30.thread.asterisk;

import static by.tms.lesson20.onl30.thread.LauncherAsterisk.*;
import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Buyer implements Runnable {
    private static int quantityPurchasedItems = 0;

    private static int buyProduct() {
        // купить в Магазине
        return quantityPurchasedItems++;
    }

    @Override
    public void run() {
        try {
            SECONDS.sleep(DELIVERY_INTERVAL_PURCHASE_IN_SECOND);
        } catch (InterruptedException e) {
            currentThread().interrupt();
        };
        System.out.printf(TEMPLATE_MESSAGE, BUYER_MESSAGE, buyProduct()); // купить товар и сообщить
    }
}
