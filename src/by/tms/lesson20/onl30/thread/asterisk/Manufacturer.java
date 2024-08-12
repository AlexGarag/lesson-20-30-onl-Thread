package by.tms.lesson20.onl30.thread.asterisk;

import static by.tms.lesson20.onl30.thread.LauncherAsterisk.*;
import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Manufacturer implements Runnable {
    private static int quantityGoodsProduced = 0;

    private static int deliverProduct() {
        // поставить товар в Магазин
        return quantityGoodsProduced++;
    }

    @Override
    public void run() {
        try {
            SECONDS.sleep(DELIVERY_INTERVAL_PRODUCT_IN_SECOND);
        } catch (InterruptedException e) {
            currentThread().interrupt();
        }
        System.out.printf(TEMPLATE_MESSAGE, MANUFACTURER_MESSAGE, deliverProduct());
    }
}
