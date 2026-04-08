import java.util.Scanner;

public class Animals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Dog[] dogs = new Dog[10];
		Cat[] cats = new Cat[10];
		int dogCount = 0;
		int catCount = 0;
		
		
		System.out.println("What's the height?");
		int height = input.nextInt();
		System.out.println("What's the weight?");
		int weight = input.nextInt();
		System.out.println("What's their name?");
		String name = input.next();
		System.out.println("Is this a dog(1) or a cat(2)?");
		int choice = input.nextInt();
		if(choice == 2) {
			System.out.println("Does your cat play?(true, false)");
			boolean play = input.nextBoolean();
			
			addCat(height, weight, name, play, cats, catCount);	
		}
		else {
			System.out.println("Does your dog fetch?(true, false)");
			boolean fetch = input.nextBoolean();
			
			addDog(height, weight, name, fetch, dogs, dogCount);
		}
		
		printArray(cats);
		printArray(dogs);
	}

	private static void printArray(Dog[] dogs) {
		for(Dog dog : dogs) { //(Class object : array)
			System.out.println(dog);//Class.object.method(method of that object);
		}
	}

	private static void printArray(Cat[] cats) {
		for(Cat cat : cats)
		{
			System.out.println(cat);
		}
		
	}

	private static void addDog(int height, int weight, String name, boolean fetch, Dog[] dogs, int dogCount) {
		dogs[dogCount] = new Dog(height, weight, name, fetch);
		dogCount ++;
	}

	private static void addCat(int height, int weight, String name, boolean play, Cat[] cats, int catCount) {
		cats[catCount] = new Cat(height, weight, name, play);
		 catCount ++;
	}

}
