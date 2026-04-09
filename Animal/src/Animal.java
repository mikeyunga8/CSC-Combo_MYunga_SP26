
public class Animal {
	private int height;
	private int weight;
	private String name;
	public Animal() {
		super();
		this.height = 0;
		this.weight = 0;
		this.name = "";
	}
	public Animal(int height, int weight, String name) {
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("Bleeeearch");
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "animal [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}
	
	
}
