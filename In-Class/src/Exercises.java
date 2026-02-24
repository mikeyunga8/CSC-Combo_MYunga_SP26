import java.util.Iterator;
import java.util.Scanner;


public class Exercises {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word I will tell you if it is abecedarian");
		String word = input.next();
		String lWord = word.toLowerCase();
		if(isAbecedarian(lWord))
		{
			System.out.println(word + " is abecedarian.");
		}
		else
		{
			System.out.println(word+ " is not abecedarian.");
		}
		
		if(isDoubloon(lWord))
		{
			System.out.println(word + " is a doubloon");
		}
		else
		{
			System.out.println(word + " is not a doubloon");
		}
	}
	/****************************************************************************************************
	 * A word is said to be a “doubloon” if every letter that appears in the word appears exactly twice.*
	 * Here are some example doubloons found in the dictionary: Abba, Anna, appall, appearer, appeases, *
	 * arraigning, beriberi, bilabial, boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horseshoer,    *
	 * intestines, Isis, mama, Mimi, murmur, noon, Otto, papa, peep, reappear, redder, sees,            *
	 * Shanghaiings, Toto Write a method called isDoubloon that takes a string and checks whether it is *
	 * a doubloon. To ignore case, invoke the toLowerCase method before checking.                       *
	 ****************************************************************************************************/
	private static boolean isDoubloon(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j))
				{
					count++;
				}
			}
			if(count > 2 || count < 2)
			{
				return false;
			}
			count = 0;
		}
		return true;
	}
	/*******************************************************
	 *A word is said to be "abecedarian" if the letters in *
	 *the word appear in alphabetical order. Write a method* 
	 *called isAbecedarian that takes a String and returns * 
	 *a boolean indicating whether the word is abecedarian *
	 *******************************************************/
	private static boolean isAbecedarian(String word) {
		for (int i = 0; i < word.length()-1; i++) {
			if(word.charAt(i) > word.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}

}
