import java.util.Scanner;

/*(Identifying anagrams) 
Two words are anagrams of each other if they contain the
same letters that are arranged in different orders. Write a recursive method that
can identify if two given words are anagrams of each other
*/


class IdentifyingAnagrams {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first word: ");
		String word1 = input.nextLine();
		System.out.print("Enter second word: ");
		String word2 = input.nextLine();
		System.out.println(isAnagram(word1, word2));
		input.close();

    }

    static boolean isAnagram(String s1, String s2)
	{
		// Convert string to lower case
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		// If the lengths doesnt match it is not an anagram
		if(s1.length() != s2.length())
		{
			return false;
		}
		else
		{

			// Invoking stringBuilder class to alter the strings
			StringBuilder sb1 = new StringBuilder(s1);
			StringBuilder sb2 = new StringBuilder(s2);
			
			return isAnagram(sb1, sb2);
		}
	}
	
	private static boolean isAnagram(StringBuilder sb1, StringBuilder sb2)
	{
		if(sb1.length() == 0 && sb2.length() == 0)
		{
			return true;
		}
		
		char checker = sb1.charAt(0);
		int index = sb2.indexOf(Character.toString(checker));

		//returns -1 if the CharacterSequence is not in StringBuilder
		if(index == -1)
		{
			return false;
		}
		
		sb1 = sb1.deleteCharAt(0);
		sb2 = sb2.deleteCharAt(index);
		return isAnagram(sb1, sb2);
	}
}