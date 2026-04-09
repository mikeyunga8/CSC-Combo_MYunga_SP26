
public class Dog extends Animal {
	private boolean fetch;
	
	public Dog() {
		super();
		fetch = true;
	}
	public Dog(int height, int weight, String name, boolean fetch) {
		super(height, weight, name);
		this.fetch = fetch;
	}
	
	public void makeNoise() {
		System.out.println("Woof woof");
	}
	public boolean isPlay() {
		return fetch;
	}
	public void setPlay(boolean fetch) {
		this.fetch = fetch;
	}
	@Override
	public String toString() {
		return "Dog3 ["  + super.toString() + "fetch=" + fetch  + "]";
	}
	
	
}

