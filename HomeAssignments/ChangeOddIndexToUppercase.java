package week3.HomeAssignments;

//import java.util.Iterator;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
	String test = "changeme";
	System.out.println(test);
	char[] charArray = test.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
	if(i % 2 !=0) {
		charArray[i] = Character.toUpperCase(charArray[i]);
	}
	
}
	String output = new String (charArray);
	System.out.println(output);
}

}
