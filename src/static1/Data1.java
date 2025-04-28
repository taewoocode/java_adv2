package static1;

public class Data1 {
	private String name;
	private static int count;

	public Data1(String name) {
		this.name = name;
		count++;
	}

	public int getCount() {
		return count;
	}
}
