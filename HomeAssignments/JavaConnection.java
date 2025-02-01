package week4.HomeAssignments;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
System.out.println("Connected");		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
	}

	@Override
	public void exceuteUpdate() {
		System.out.println("Execute Update");
	}
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.exceuteUpdate();
		
	}

}
