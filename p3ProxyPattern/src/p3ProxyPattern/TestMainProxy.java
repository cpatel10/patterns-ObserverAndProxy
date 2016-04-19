package p3ProxyPattern;

public class TestMainProxy {
	
	public static void main(String[] args){
		
		Database employee= new DatabaseUserProxy("Annie", "IlonkaChinki");
		
		   employee.executeCommand();		 
	
	
	    Database employee1= new DatabaseUserProxy("Annie", "123456");
	
	        employee1.executeCommand();
	}
	
	

}
