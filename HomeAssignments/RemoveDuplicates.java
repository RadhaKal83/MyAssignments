package week3.HomeAssignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
String text ="We learn Java basics as part of java sessions in java week1";
System.out.println(text);
String [] words = text.split(" ");
for (int i = 0; i < words.length; i++) {
	for (int j = i+1 ; j < words.length; j++) {
		if (words[i].equalsIgnoreCase(words[j])) {
			words[j]=" ";
		}
			}
				}
String output = String.join(" ", words);
System.out.println(output);






	}

}
