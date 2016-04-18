

import java.util.ArrayList;

public class StockExchange implements Subject {
	
	
	private int bmwStockPrice;
	private int gmcStockPrice;
	private int teslaStockPrice;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
		


	@Override
	public void attachObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void detachObserver(Observer observer) {
		observers.remove(observer);	
		
		
	}

	@Override
	public void notifyObserver() {
		
		for(Observer observer : observers){
	     observer.update(bmwStockPrice, gmcStockPrice, teslaStockPrice);
				
		}
	}
	
	public void setbmwStockPrice(int newbmwStockPrice){
		this.bmwStockPrice = newbmwStockPrice;
		notifyObserver();
	}
	
	public void setgmcStockPrice(int newgmcStockPrice){
		this.gmcStockPrice = newgmcStockPrice;
		notifyObserver();
	}
	
	public void setteslaStockPrice(int newteslaStockPrice){
		this.teslaStockPrice = newteslaStockPrice;
		notifyObserver();
	}

}
