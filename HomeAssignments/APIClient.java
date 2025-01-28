package week3.HomeAssignments;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {
	System.out.println(endPoint+requestBody+requestStatus);
	}
	public static void main(String[] args) 
	{
		APIClient ol = new APIClient();
		ol.sendRequest("Hello");
		ol.sendRequest("Hello, Welcome, false");
}
}
