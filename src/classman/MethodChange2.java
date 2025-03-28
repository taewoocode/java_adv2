package classman;

public class MethodChange2 {

	public static void main(String[] args) {
		ProductOrder.Data dataA = new ProductOrder.Data();
		dataA.value = 10;
		// System.out.println("메서드 호출 전: dataA.value = " + dataA.value); //10
		// changeReference(dataA);
		// System.out.println("메서드 호출 후: dataA.value = " + dataA.value); //20
		// System.out.println("===========================================");
		//
		// dataA.name = "김철수";
		// System.out.println("메서드 호출 전: dataA.value = " + dataA.name); //김철수
		// changeReferName(dataA);
		// System.out.println("메서드 호출 후: dataA.value = " + dataA.name); // 박태우
		// System.out.println("============================================");
		//
		// dataA.height = 60;
		// System.out.println("메서드 호출 전: dataA.value = " + dataA.height); //60
		// changeHeight(dataA);
		// System.out.println("메서드 호출 후: dataA.value = " + dataA.height); // 100

		Integer a = 60;
		System.out.println("원본 Integer a의 hashCode: " + a.hashCode());  // 60의 hashCode 출력
		changeIntegerNumber(a);
		System.out.println("changeIntegerNumber 메서드 호출 후 Integer a 값: " + a);  // a 값 확인
		System.out.println("메서드 호출 후 원본 Integer a의 hashCode: " + a.hashCode());  // a의 hashCode 출력
	}

	private static void changeIntegerNumber(Integer a) {
		a = 100;
	}

	private static void changeHeight(ProductOrder.Data dataA) {
		dataA.height = 100;
	}

	private static void changeReferName(ProductOrder.Data dataA) {
		dataA.name = "박태우";
	}

	private static void changeReference(ProductOrder.Data dataX) {
		dataX.value = 20;
	}
}
