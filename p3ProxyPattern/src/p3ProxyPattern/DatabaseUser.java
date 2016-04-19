package p3ProxyPattern;

public class DatabaseUser implements Database {

	@Override
	public void executeCommand() {
		System.out.println("Adding/Editing/Deleting records in database");
		
	}

}
