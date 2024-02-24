package observer.entity;

import observer.interfaces.StockObservable;
import observer.interfaces.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneStockObservable implements StockObservable {

    private List<StockObserver> stockObserverList = new ArrayList<>();

    private int currentStock = 0;

    @Override
    public void addObserver(StockObserver stockObserver) {
        stockObserverList.add(stockObserver);
    }

    @Override
    public void removeObserver(StockObserver stockObserver) {
        stockObserverList.remove(stockObserver);
    }

    @Override
    public void notifyObserver() {
        for(StockObserver stockObserver : stockObserverList) {
            stockObserver.update();
        }
    }

    @Override
    public void setData(int stock) {
        if(this.currentStock == 0 && stock > 0) {
            notifyObserver();
        }
        this.currentStock = stock;
    }

    @Override
    public int getData() {
        return this.currentStock;
    }
}
