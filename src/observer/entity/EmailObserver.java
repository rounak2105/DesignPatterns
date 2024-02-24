package observer.entity;

import observer.interfaces.StockObservable;
import observer.interfaces.StockObserver;

public class EmailObserver implements StockObserver {
    private String email;
    private StockObservable stockObservable;
    public EmailObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Sending email to " + email + " qty is " + this.stockObservable.getData());
    }
}
