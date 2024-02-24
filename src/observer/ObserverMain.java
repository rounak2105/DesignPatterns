package observer;

import observer.entity.EmailObserver;
import observer.entity.IPhoneStockObservable;
import observer.entity.TextObserver;
import observer.interfaces.StockObservable;
import observer.interfaces.StockObserver;

public class ObserverMain {
    public static void main(String[] args) {
        StockObservable stockObservable = new IPhoneStockObservable();
        StockObserver stockObserver1 = new EmailObserver("rounak2k@gmail.com", stockObservable);
        StockObserver stockObserver2 = new TextObserver("1234567890", stockObservable);
        stockObservable.addObserver(stockObserver1);
        stockObservable.addObserver(stockObserver2);
        stockObservable.setData(100);
        stockObservable.setData(0);
        stockObservable.setData(20);
    }
}
