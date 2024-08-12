package by.tms.lesson20.onl30.thread;

import by.tms.lesson20.onl30.thread.asterisk.Buyer;
import by.tms.lesson20.onl30.thread.asterisk.Manufacturer;
import by.tms.lesson20.onl30.thread.asterisk.Shop;

import static by.tms.lesson20.onl30.thread.homework.ManagerThreads.startThread;

public class LauncherAsterisk {
    public static final String TEMPLATE_MESSAGE = "%s : %d.\n\t%s : %d.\n";
    public static final String MANUFACTURER_MESSAGE = "The Manufacturer delivered the product to the Shop";
    public static final String BUYER_MESSAGE = "The Buyer bought the product in the Shop";
    public static final String QUANTITY_PRODUCT_SHOP = "The quantity of product in the Shop";
    public static final int DELIVERY_INTERVAL_PRODUCT_IN_SECOND = 4;
    public static final int DELIVERY_INTERVAL_PURCHASE_IN_SECOND = 4;

    public static void main(String[] args) {
//        Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так чтобы
//        производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
//        не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
//        может находиться не более 3 товаров

//        Shop shop = new Shop();

//        Buyer buyer = new Buyer();
        Manufacturer manufacturer = new Manufacturer();
        startThread(/*new Thread(buyer), */new Thread(manufacturer));
    }
}
