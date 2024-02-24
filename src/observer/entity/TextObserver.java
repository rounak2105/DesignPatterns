package observer.entity;

import observer.interfaces.StockObservable;
import observer.interfaces.StockObserver;

public class TextObserver implements StockObserver {
    private String phone;
    private StockObservable stockObservable;
    public TextObserver(String phone, StockObservable stockObservable) {
        this.phone = phone;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Sending text to " + phone + " qty is " + stockObservable.getData());
    }
}
