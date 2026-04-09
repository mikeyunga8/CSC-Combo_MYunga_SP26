
public class Cat extends Animal {
	private boolean play;
	
	public Cat() {
		super();
		play = true;
	}
	public Cat(int height, int weight, String name, boolean play) {
		super(height, weight, name);
		this.play = play;
	}
	
	public void makeNoise() {
		System.out.println("Meow meow");
	}
	public boolean isPlay() {
		return play;
	}
	public void setPlay(boolean play) {
		this.play = play;
	}
	@Override
	public String toString() {
		return "Cat2 ["  + super.toString() + "play=" + play  + "]";
	}
	
	
}
