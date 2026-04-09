import java.util.ArrayList;
import java.util.Scanner;

public class Animals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Animal> farm = new ArrayList<>();
		
		farm.add(new Cat(7, 1, "Fluffy", true));
		farm.add(new Dog(35, 2, "Fido", false));
		farm.add(new Animal(75, 3, "Ugg"));
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
			
			farm.add(new Cat (height, weight , name, play));
		}
		else if (choice == 1){
			System.out.println("Does your dog fetch?(true, false)");
			boolean fetch = input.nextBoolean();
			
			farm.add(new Dog (height, weight , name, fetch));
		}else {
			farm.add(new Animal(height, weight, name));
		}
		
		//printArray(cats);
		//printArray(dogs);
		printFarm(farm);
	}

	private static void printFarm(ArrayList<Animal> farm) {
		for(Animal ani : farm) {
			System.out.println(ani);
		}
	}

	private static void printArray(Dog2[] dogs) {
		for(Dog2 dog : dogs) { //(Class object : array)
			System.out.println(dog);//Class.object.method(method of that object);
		}
	}

	private static void printArray(Cat3[] cats) {
		for(Cat3 cat : cats)
		{
			System.out.println(cat);
		}
		
	}

	private static void addDog(int height, int weight, String name, boolean fetch, Dog2[] dogs, int dogCount) {
		dogs[dogCount] = new Dog2(height, weight, name, fetch);
		dogCount ++;
	}

	private static void addCat(int height, int weight, String name, boolean play, Cat3[] cats, int catCount) {
		cats[catCount] = new Cat3(height, weight, name, play);
		 catCount ++;
	}

}
