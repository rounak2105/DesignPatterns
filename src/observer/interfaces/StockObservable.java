package observer.interfaces;


public interface StockObservable {
    void addObserver(StockObserver stockObserver);
    void removeObserver(StockObserver stockObserver);
    void notifyObserver();
    void setData(int data);
    int getData();
}
