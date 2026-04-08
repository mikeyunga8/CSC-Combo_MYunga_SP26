
public class Cat {
	private int weight;
	private int height;
	private String name;
	private boolean play;

	public Cat() {
		this.weight = 0;
		this.height = 0;
		this.name = "";
		this.play = true;
	}

	public Cat(int weight, int height, String name, boolean play) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.play = play;
	}

	public String makeNoise() {
		return "meow meow";
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

	public boolean isPlay() {
		return play;
	}

	public void setPlay(boolean play) {
		play = play;
	}

}
