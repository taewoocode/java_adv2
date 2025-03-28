package classman;

import java.io.BufferedReader;

public class ProductOrder {
	private String productName;
	private int price;
	private int quantity;

	public ProductOrder(String productName, int price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}


	static class ProductMain {
		public static void main(String[] args) {

			ProductOrder productOrder1 = new ProductOrder("두부", 2000, 2);
			ProductOrder productOrder2 = new ProductOrder("김치", 5000, 1);
			ProductOrder productOrder3 = new ProductOrder("콜라", 1500, 2);
			ProductOrder[] productOrders = new ProductOrder[40];
			productOrders[0] = productOrder1;
			productOrders[1] = productOrder2;
			productOrders[2] = productOrder3;

			int count = 0;
			for (ProductOrder order : productOrders) {
				if (order == null) {
					break;
				}
				System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ",수량: " + order.quantity);
				count = getCount(order, count);
			}
			System.out.println("총 결제 금액: " + count);
		}

		private static int getCount(ProductOrder order, int count) {
			return count += order.price * order.quantity;
		}
	}

	static class Data {
		int value;
		String name;
		Integer height;

		public static void main(String[] args) {
			Data dataA = new Data();
			dataA.value = 10;
			Data dataB = dataA;
			Data dataC = new Data();

			//참조값 공유 추가
			dataC = dataB;

			System.out.println("dataA = " + dataA); // 10
			System.out.println("dataB = " + dataB); // 10
			System.out.println("dataC = " + dataC); // 10


			System.out.println("dataA.value = " + dataA.value); // 10
			System.out.println("dataB.value = " + dataB.value); // 10

			dataA.value = 20;
			System.out.println(dataA.value); // 20
			System.out.println(dataB.value); // 20

			dataB.value = 30;
			System.out.println(dataA.value); // 30
			System.out.println(dataB.value); // 30

			changeValue(dataB);
			System.out.println(dataA.value); // 50
			System.out.println(dataB.value); // 50

			changeValueForC(dataC);
			System.out.println(dataA.value); // 50
			System.out.println(dataB.value); // 50
			System.out.println(dataC.value); // 50
			System.out.println("==================================================");
		}

		/**
		 * B만 변경하는 것이아닌 A까지 변경한다.
		 * @param data
		 */
		public static void changeValue(Data data) {
			data.value = 50;
		}

		public static void changeValueForC(Data data) {
			data.value = 90;
		}

	}


	static class MethodChange1 {
		public static void main(String[] args) {
			int a = 10;
			System.out.println("메서드 호출 전: a = " + a); // 10
			a = changePrimitive(a);
			System.out.println("메서드 호출 후: a = " + a); // 10
			/**
			 * 바뀌지 않는 이유는 Method Scope가 다르다.
			 */

			Integer b = 10;
			System.out.println("메서드 호출 전: b = " + b); // 10
			b = changeRapperInteger(b);
			System.out.println("메서드 호출 후: b = " + b); // 60

			/**
			 * String은 toString이 오버라이딩 되어있다.
			 */
			String name = "김진수";
			System.out.println(name);
			String changeName = changeName(name);
			name = changeName;
			System.out.println(changeName);
			System.out.println(name);

			MovieReview movieReview = new MovieReview("바람과 함께 사라지다.", "또 보고싶어요.");
			MovieReview changeMovieName = movieReview.changeName("김치찌개로 영화 변경");
			System.out.println(changeMovieName);



		}

		private static String changeName(String name) {
			System.out.println(name); // 김진수
			name = "박태우";
			System.out.println(name); // 박태우
			return name;
		}

		private static Integer changeRapperInteger(Integer b) {
			b = 60;
			return b;
		}

		private static int changePrimitive(int a) {
			a = 20;
			return a;
		}
	}

}
