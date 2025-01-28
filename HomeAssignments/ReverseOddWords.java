package week3.HomeAssignments;

public class ReverseOddWords {


	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] words = test.split("\\s+");
		String output = "";
		for (int i = 0; i < words.length; i++) {
			if (( i+1 ) % 2 ==0) {
				String reversedWord = "";
				char[] charArray = words[i].toCharArray();
				for (int j = charArray.length - 1 ; j>=0 ; j--) {
					reversedWord += charArray[j];
					
				}
				output += reversedWord;
				
			}
			else
			{
				output += words[i];
			}
			if (i < words.length -1) {
				output += " ";
			}
		}
		
		System.out.println(output);
		
		
		
		
		
		
		
		
	}

}
