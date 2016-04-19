package p3ProxyPattern;

public class DatabaseUserProxy implements Database{
	
	private Database employee;
	
	private boolean isAdmin;
	
	public DatabaseUserProxy(String user, String pwd){
		if("Annie".equals(user) && "IlonkaChinki".equals(pwd)) isAdmin=true;
		employee= new DatabaseUser();
	}

	@Override
	public void executeCommand() {
		if(isAdmin){
			employee.executeCommand();
						
		}
		else {
			System.out.println("Database Access Limited: You can only read the records; You do not have permission to add, edit or delete the records.");
		}
		
	}
}


