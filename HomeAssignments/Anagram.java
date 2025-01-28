package week3.HomeAssignments;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) 
{
	String word ="stops";
	String word1 = "potss";
	int length = word.length();
	int length1 = word1.length();
	System.out.println("The length of word is " + length);			
	System.out.println("The length of word1 is" + length1);
	if (length == length1)
{
	System.out.println("The word is Anagram");
}
	else
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	char[] charArray = word . toCharArray();	
	char[] charArray1 = word1 .toCharArray();
	Arrays.sort(charArray);
	Arrays.sort(charArray1);
	//for (int i=0; i<charArray.length;i++) {
	//	System.out.println(charArray[i]);
//	}
	//for (int j=0; j<charArray.length;j++) {
	//System.out.println(charArray1[j]);
	//}
	if (charArray == charArray1) {
		System.out.println("The given strings are Anagram");
	}
	else
		System.out.println("The given strings are not an Anagram");
}

}

