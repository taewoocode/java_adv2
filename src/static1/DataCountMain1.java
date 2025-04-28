package static1;

public class DataCountMain1 {

	public static void main(String[] args) {
		initInstance();

	}

	private static void initInstance() {
		Data1 data1 = new Data1("A");
		Data1 data2 = new Data1("B");
		Data1 data3 = new Data1("C");
		printInstance(data1, data2, data3);
	}

	private static void printInstance(Data1 data1, Data1 data2, Data1 data3) {
		System.out.println("A count = " + data1.getCount());
		System.out.println("A count = " + data2.getCount());
		System.out.println("A count = " + data3.getCount());
	}
}
