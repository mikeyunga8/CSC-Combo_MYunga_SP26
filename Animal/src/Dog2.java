
public class Dog2 {
	private int weight;
	private int height;
	private String name;
	private boolean fetch;

	public Dog2() {
		this.weight = 0;
		this.height = 0;
		this.name = "";
		this.fetch = true;
	}

	public Dog2(int weight, int height, String name, boolean fetch) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.fetch = fetch;
	}

	public String makeNoise() {
		return "woof woof";
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFetch() {
		return fetch;
	}

	public void setFetch(boolean fetch) {
		fetch = fetch;
	}

}
