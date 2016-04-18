
public class Customer implements Observer {

	private int bmwStockPrice;
	private int teslaStockPrice;
	private int gmcStockPrice;
	
    private String customerName;
	
	

	public Customer(String customerName) {
		this.customerName=customerName;
		
	}	
	public String getCustomerName() {
			return customerName;
		}

	public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
	
	
	

	@Override
	public void update(int bmwStockPrice, int gmcStockPrice, int teslaStockPrice) {
		
		this.bmwStockPrice= bmwStockPrice;
		this.gmcStockPrice=gmcStockPrice;
		this.teslaStockPrice=teslaStockPrice;
	    
		getStockPrices();
	}

	public void getStockPrices() {
		System.out.println( customerName + "\nThe current BMW stock price is:" +bmwStockPrice + "\nThe current GMC stock price is:" + gmcStockPrice + "\nThe current Tesla motors stock price is:" + teslaStockPrice);
		
	}
	

}
