

public class TestMainObserver {
	
	public static void main(String[] args){
	
	StockExchange stockExchange= new StockExchange();
		
	Customer cust1= new Customer("Annie");
	Customer cust2= new Customer ("Chinki");
	Customer cust3= new Customer("Ilonka");
	
	stockExchange.attachObserver(cust1);
	stockExchange.attachObserver(cust2);
	stockExchange.attachObserver(cust3);
	
	  
	stockExchange.setbmwStockPrice(500);
	stockExchange.setgmcStockPrice(600);
	stockExchange.setteslaStockPrice(700);
	
	
	stockExchange.detachObserver(cust2);
	
	stockExchange.setbmwStockPrice(400);
	stockExchange.setgmcStockPrice(650);
	stockExchange.setteslaStockPrice(700);
	
    }
}