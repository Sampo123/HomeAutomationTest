package homeautomation.test;

public class Mutteri {
	
	int koko;
	float nouse = 1.3f;

	public Mutteri(int koko) {
		this.koko = koko;
	}
	
	public void printMyName() {
		System.out.println("M" + this.koko);
	}
	
}
