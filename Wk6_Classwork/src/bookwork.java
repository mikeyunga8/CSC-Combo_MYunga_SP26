import java.util.Scanner;

public class bookwork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fruit = "banana";
		
		char letter = fruit.charAt(0);
		System.out.println(letter);
		System.out.println("Type banana");
		fruit = input.next();
		if(fruit.equals("banana"))System.out.println("True");
		else System.out.println("False");
		
		System.out.println("Roman alphabet: ");
		for(char c = 'A'; c <= 'Z'; c ++)
		{
			System.out.print(c);
		}
		char c = 'A';
		System.out.println();
		while(c <= 'Z')
		{
			System.out.print(c);
			c++;
		}
		System.out.println();
		for (int i = 913; i <= 937; i++) {
			System.out.print((char) i);
		}
		System.out.println();
		System.out.println("Enter a number");
		while(!input.hasNextDouble())
		{
			String word = input.next();
			System.err.println(word + " is not a number!");
			System.out.println("Enter a number");			
		}
		double num = input.nextDouble();
		System.out.println(num);
		
		String words = "Hello World How are you, fine I hope, but prolly not.";
		for (int i = 0; i < words.length(); i++) {
			letter = words.charAt(i);
			System.out.println(letter);
		}
		int len = words.length();
		char last = words.charAt(len - 1);
		String rev = reverse(words);
		System.out.println(rev);
		
		int index = words.indexOf("o", words.indexOf('o')+1)+1;
		System.out.println(index);
		index = words.lastIndexOf('o');
		System.out.println(index);
		
		System.out.println(words.substring(words.indexOf('o'), 8));
		
		System.out.println("Enter yes or no");
		String word = input.next();
		word = word.toLowerCase();
		if(word.equals("yes"))
		{
			System.out.println("Hell " + word);
		}
		if(word.equals("no"))
		{
			System.out.println("Awww");
		}
			
		String name1 = "Ada Lovelace";
		String name2 = "Alan Turing";
		int diff = name1.compareTo(name2);
		if(diff < 0)
		{
			System.out.println("Name1 comes before name2 alphabetically.");
		} else if(diff > 0)
		{
			System.out.println("Name2 comes before name1 alphabetically.");

		}else
		{
			System.out.println("Names are the same");
		}
		
		System.out.println(diff);
	}

	private static String reverse(String words) {
		String ret = "";
		for(int i = words.length()-1; i >= 0; i--)
		{
			ret += words.charAt(i);
		}
		return ret;
	}

}
